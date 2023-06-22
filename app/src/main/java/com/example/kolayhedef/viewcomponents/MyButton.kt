package com.example.kolayhedef.viewcomponents

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.example.kolayhedef.R
import com.example.kolayhedef.databinding.MyButtonBinding


class MyButton : RelativeLayout {

    private lateinit var binding: MyButtonBinding
    private var text: String? = null
    private var icon: Int? = null
    private lateinit var size: MyButtonSize
    private lateinit var theme: MyButtonTheme

    constructor(context: Context) : super(context) {
        icon = R.drawable.ic_launcher_foreground
        size = MyButtonSize.LARGE
        theme = MyButtonTheme.COLORED
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView(context, attrs)
    }

    private fun initView(context: Context?, attrs: AttributeSet? = null) {
        binding = MyButtonBinding.inflate(LayoutInflater.from(context), this, true)
        val attributes = context?.obtainStyledAttributes(attrs, R.styleable.MyButton)
        attributes?.let {
            setAttrs(attributes)
        }
        setView()
    }

    private fun setAttrs(attributes: TypedArray) {
        with(attributes) {
            getString(R.styleable.MyButton_text)?.let {
                text = it
            }
            val attrIcon = getResourceId(R.styleable.MyButton_icon, 0)
            if (attrIcon != 0) icon = attrIcon

            val attrSize = getInt(R.styleable.MyButton_btnSize, MyButtonSize.LARGE.ordinal)
            size = MyButtonSize.values()[attrSize]

            val attrTheme = getInt(R.styleable.MyButton_btnTheme, MyButtonTheme.COLORED.ordinal)
            theme = MyButtonTheme.values()[attrTheme]
        }
    }

    private fun setView() {
        with(binding) {
            text?.let { textView.text = it }

            icon?.let {
                textView.isGone = true
                imageView.apply {
                    setImageResource(it)
                    isVisible = true
                }
            }

            setSize(layout)
            setTheme(layout)

            theme.takeIf { it == MyButtonTheme.TRANSPARENT }?.let {
                val color = resources.getColor(R.color.black, null)
                textView.setTextColor(color)
                imageView.imageTintList = ColorStateList.valueOf(color)
            }
        }
    }

    private fun setSize(layout: View) {
        val largeHeight = resources.getDimension(R.dimen.my_button_large_height).toInt()
        val smallHeight = resources.getDimension(R.dimen.my_button_small_height).toInt()
        layout.layoutParams = layout.layoutParams.apply {
            width = ViewGroup.LayoutParams.MATCH_PARENT
            when (size) {
                MyButtonSize.SMALL -> height = smallHeight
                MyButtonSize.LARGE -> height = largeHeight
                MyButtonSize.SQUARE -> {
                    width = largeHeight
                    height = largeHeight
                }
            }
        }
    }

    private fun setTheme(layout: View) {
        val bgColor = when (theme) {
            MyButtonTheme.COLORED -> R.color.black
            MyButtonTheme.DARK -> R.color.black
            MyButtonTheme.TRANSPARENT -> android.R.color.transparent
        }
        layout.background = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            color = ContextCompat.getColorStateList(context, bgColor)
            cornerRadius = resources.getDimension(R.dimen.border_radius)
        }
    }

    fun setText(text: String) {
        binding.textView.text = text
    }

    fun setColor(colorId: Int) {
        binding.layout.background = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            color = ContextCompat.getColorStateList(context, colorId)
            cornerRadius = resources.getDimension(R.dimen.border_radius)
        }
    }

    private enum class MyButtonTheme {
        DARK,
        COLORED,
        TRANSPARENT
    }

    private enum class MyButtonSize {
        SMALL,
        LARGE,
        SQUARE
    }
}

