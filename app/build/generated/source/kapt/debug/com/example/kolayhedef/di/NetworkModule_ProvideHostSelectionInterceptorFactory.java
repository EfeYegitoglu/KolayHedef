// Generated by Dagger (https://dagger.dev).
package com.example.kolayhedef.di;

import com.example.kolayhedef.data.HostSelectionInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHostSelectionInterceptorFactory implements Factory<HostSelectionInterceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideHostSelectionInterceptorFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public HostSelectionInterceptor get() {
    return provideHostSelectionInterceptor(module);
  }

  public static NetworkModule_ProvideHostSelectionInterceptorFactory create(NetworkModule module) {
    return new NetworkModule_ProvideHostSelectionInterceptorFactory(module);
  }

  public static HostSelectionInterceptor provideHostSelectionInterceptor(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHostSelectionInterceptor());
  }
}
