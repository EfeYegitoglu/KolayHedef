package com.example.kolayhedef.ui.onboard;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.kolayhedef.R;

public class SelectExamFragmentDirections {
  private SelectExamFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSelectExamFragmentToSelectDateFragment() {
    return new ActionOnlyNavDirections(R.id.action_selectExamFragment_to_selectDateFragment);
  }
}
