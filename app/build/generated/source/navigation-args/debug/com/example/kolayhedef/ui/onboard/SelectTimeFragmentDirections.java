package com.example.kolayhedef.ui.onboard;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.kolayhedef.R;

public class SelectTimeFragmentDirections {
  private SelectTimeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSelectTimeFragmentToAccountInfoFragment() {
    return new ActionOnlyNavDirections(R.id.action_selectTimeFragment_to_accountInfoFragment);
  }
}
