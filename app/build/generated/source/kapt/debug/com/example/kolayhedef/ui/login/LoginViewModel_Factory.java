// Generated by Dagger (https://dagger.dev).
package com.example.kolayhedef.ui.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  @Override
  public LoginViewModel get() {
    return newInstance();
  }

  public static LoginViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LoginViewModel newInstance() {
    return new LoginViewModel();
  }

  private static final class InstanceHolder {
    private static final LoginViewModel_Factory INSTANCE = new LoginViewModel_Factory();
  }
}
