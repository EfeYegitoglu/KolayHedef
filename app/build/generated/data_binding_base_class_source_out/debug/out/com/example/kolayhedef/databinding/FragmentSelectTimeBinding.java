// Generated by view binder compiler. Do not edit!
package com.example.kolayhedef.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kolayhedef.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSelectTimeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton buttonClose;

  @NonNull
  public final AppCompatButton buttonSave;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  private FragmentSelectTimeBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton buttonClose, @NonNull AppCompatButton buttonSave,
      @NonNull CheckBox checkBox, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar,
      @NonNull TextView textView6, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.buttonClose = buttonClose;
    this.buttonSave = buttonSave;
    this.checkBox = checkBox;
    this.imageView2 = imageView2;
    this.progressBar = progressBar;
    this.textView6 = textView6;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSelectTimeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSelectTimeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_select_time, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSelectTimeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_close;
      ImageButton buttonClose = ViewBindings.findChildViewById(rootView, id);
      if (buttonClose == null) {
        break missingId;
      }

      id = R.id.button_save;
      AppCompatButton buttonSave = ViewBindings.findChildViewById(rootView, id);
      if (buttonSave == null) {
        break missingId;
      }

      id = R.id.checkBox;
      CheckBox checkBox = ViewBindings.findChildViewById(rootView, id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new FragmentSelectTimeBinding((ConstraintLayout) rootView, buttonClose, buttonSave,
          checkBox, imageView2, progressBar, textView6, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
