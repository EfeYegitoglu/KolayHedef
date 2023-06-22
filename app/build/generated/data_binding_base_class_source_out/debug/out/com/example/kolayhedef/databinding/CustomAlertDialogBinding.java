// Generated by view binder compiler. Do not edit!
package com.example.kolayhedef.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kolayhedef.R;
import com.example.kolayhedef.viewcomponents.MyButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomAlertDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MyButton alertButton;

  @NonNull
  public final AppCompatImageView appCompatImageView;

  @NonNull
  public final TextView errorTitle;

  @NonNull
  public final TextView errorView;

  @NonNull
  public final LinearLayout linearLayout;

  private CustomAlertDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull MyButton alertButton, @NonNull AppCompatImageView appCompatImageView,
      @NonNull TextView errorTitle, @NonNull TextView errorView,
      @NonNull LinearLayout linearLayout) {
    this.rootView = rootView;
    this.alertButton = alertButton;
    this.appCompatImageView = appCompatImageView;
    this.errorTitle = errorTitle;
    this.errorView = errorView;
    this.linearLayout = linearLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomAlertDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomAlertDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_alert_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomAlertDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alertButton;
      MyButton alertButton = ViewBindings.findChildViewById(rootView, id);
      if (alertButton == null) {
        break missingId;
      }

      id = R.id.appCompatImageView;
      AppCompatImageView appCompatImageView = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView == null) {
        break missingId;
      }

      id = R.id.errorTitle;
      TextView errorTitle = ViewBindings.findChildViewById(rootView, id);
      if (errorTitle == null) {
        break missingId;
      }

      id = R.id.errorView;
      TextView errorView = ViewBindings.findChildViewById(rootView, id);
      if (errorView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      return new CustomAlertDialogBinding((ConstraintLayout) rootView, alertButton,
          appCompatImageView, errorTitle, errorView, linearLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}