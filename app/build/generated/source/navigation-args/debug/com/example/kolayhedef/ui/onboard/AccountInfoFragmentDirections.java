package com.example.kolayhedef.ui.onboard;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.kolayhedef.R;

public class AccountInfoFragmentDirections {
  private AccountInfoFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAccountInfoFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_accountInfoFragment_to_homeFragment);
  }
}
