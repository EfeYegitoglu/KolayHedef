// Generated by Dagger (https://dagger.dev).
package com.example.kolayhedef.base;

import android.content.SharedPreferences;
import androidx.viewbinding.ViewBinding;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseFragment_MembersInjector<VB extends ViewBinding, VM extends BaseViewModel> implements MembersInjector<BaseFragment<VB, VM>> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public BaseFragment_MembersInjector(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static <VB extends ViewBinding, VM extends BaseViewModel> MembersInjector<BaseFragment<VB, VM>> create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new BaseFragment_MembersInjector<VB, VM>(sharedPreferencesProvider);
  }

  @Override
  public void injectMembers(BaseFragment<VB, VM> instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.example.kolayhedef.base.BaseFragment.sharedPreferences")
  public static <VB extends ViewBinding, VM extends BaseViewModel> void injectSharedPreferences(
      BaseFragment<VB, VM> instance, SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
