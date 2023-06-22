package com.example.kolayhedef.ui.onboard;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.kolayhedef.R;

public class SelectDateFragmentDirections {
  private SelectDateFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSelectDateFragmentToSelectTimeFragment() {
    return new ActionOnlyNavDirections(R.id.action_selectDateFragment_to_selectTimeFragment);
  }
}
