// Generated by Dagger (https://dagger.dev).
package com.example.kolayhedef.di;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvidesRetrofitFactory(NetworkModule module, Provider<Gson> gsonProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(module, gsonProvider.get(), okHttpClientProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitFactory create(NetworkModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvidesRetrofitFactory(module, gsonProvider, okHttpClientProvider);
  }

  public static Retrofit providesRetrofit(NetworkModule instance, Gson gson,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.providesRetrofit(gson, okHttpClient));
  }
}
