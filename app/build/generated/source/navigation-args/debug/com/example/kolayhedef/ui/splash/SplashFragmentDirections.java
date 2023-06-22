package com.example.kolayhedef.ui.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.kolayhedef.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_loginFragment);
  }
}
