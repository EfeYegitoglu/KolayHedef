package com.example.kolayhedef.ui.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.kolayhedef.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSelectExamFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_selectExamFragment);
  }
}
