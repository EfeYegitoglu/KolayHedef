package com.example.kolayhedef.base

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.example.kolayhedef.ui.MainActivity
import com.example.kolayhedef.R
import com.example.kolayhedef.databinding.CustomAlertDialogBinding
import com.example.kolayhedef.utils.extensions.findNavControllerSafely
import java.lang.Exception
import javax.inject.Inject

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel> : Fragment() {
    @Inject
    lateinit var sharedPreferences: SharedPreferences

    private val progressDialog: AppCompatDialog? by lazy {
        AppCompatDialog(requireContext(), R.style.ProgressDialog).apply {
            setContentView(R.layout.dialog_loading)
            setCancelable(false)
        }
    }

    val alertDialog: AlertDialog? by lazy {
        AlertDialog.Builder(requireContext(), R.style.AlertDialog).create()
    }

    protected lateinit var binding: VB

    abstract fun layoutInflater(inflater: LayoutInflater): VB

    abstract val viewModel: VM

    private var isDialogShowing: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initObservers()
        initBaseViewModelObservers()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = layoutInflater(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initBaseViewModelObservers() {
        with(viewModel) {
            loadingLiveData.observe(this@BaseFragment) {
                showLoading(it)
            }
            errorLiveData.observe(this@BaseFragment) {
                if (it?.code == -9999) {
                    showFatalError()
                } else {
                    showErrorDialog(it)
                }
            }
            fatalErrorLiveData.observe(this@BaseFragment) {
                showFatalError()
            }
        }
    }

    private fun showErrorDialog(error: ErrorModel) {
        if (!isDialogShowing) {
            isDialogShowing = true
            val errorDialog: AlertDialog =
                AlertDialog.Builder(requireContext(), R.style.AlertDialog).create()
            val binding: CustomAlertDialogBinding =
                CustomAlertDialogBinding.inflate(LayoutInflater.from(context))
            errorDialog.apply {
                binding.errorTitle.text = getString(R.string.unknown_error)
                binding.errorView.text = error.message
                binding.alertButton.setOnClickListener {
                    this.dismiss()
                }
                setView(binding.root)
                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                setOnDismissListener {
                    isDialogShowing = false
                    if (error.code == 1000) {
                        //navigateToLogin()
                    }
                }
                show()
            }
        }
    }

    private fun showLoading(show: Boolean) {
        if (show) {
            progressDialog?.show()
        } else {
            progressDialog?.dismiss()
        }
    }

    abstract fun initViews()

    abstract fun initObservers()

    fun navigate(direction: NavDirections) {
        findNavController().navigate(direction)
    }

    fun navigateSafely(fragmentId: Int, direction: NavDirections) {
        findNavControllerSafely(fragmentId)?.navigate(direction)
    }

    override fun onDestroy() {
        with(viewModel) {
            loadingLiveData.removeObservers(this@BaseFragment)
            errorLiveData.removeObservers(this@BaseFragment)
            fatalErrorLiveData.removeObservers(this@BaseFragment)
        }
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
        val imm: InputMethodManager =
            requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        try {
            imm.hideSoftInputFromWindow(binding.root.windowToken, 0)
        } catch (ex: Exception) {
            Log.e("VIEW_ERROR", ex.message ?: "")
        }
    }

    fun setStatusBarColor(color: Int) {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), color)
    }

    private fun showFatalError() {
        if (!isDialogShowing) {
            isDialogShowing = true
            showLoading(false)
            val errorDialog: AlertDialog =
                AlertDialog.Builder(requireContext(), R.style.AlertDialog).create()
            val binding: CustomAlertDialogBinding =
                CustomAlertDialogBinding.inflate(LayoutInflater.from(context))
            errorDialog.apply {
                binding.errorTitle.text = getString(R.string.unknown_error)
                binding.alertButton.setOnClickListener {
                    this.dismiss()
                }
                setView(binding.root)
                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                setOnDismissListener {
                    isDialogShowing = false
                    (activity as MainActivity).triggerRebirth()
                }
                show()
            }
        }
    }

}