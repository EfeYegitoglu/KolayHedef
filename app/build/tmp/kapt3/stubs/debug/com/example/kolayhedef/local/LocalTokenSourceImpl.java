package com.example.kolayhedef.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/kolayhedef/local/LocalTokenSourceImpl;", "Lcom/example/kolayhedef/local/LocalTokenSource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "deleteUserAccessToken", "", "getUserAccessToken", "", "saveUserAccessToken", "", "token", "app_debug"})
public final class LocalTokenSourceImpl implements com.example.kolayhedef.local.LocalTokenSource {
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject()
    public LocalTokenSourceImpl(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @java.lang.Override()
    public void saveUserAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserAccessToken() {
        return null;
    }
    
    @java.lang.Override()
    public boolean deleteUserAccessToken() {
        return false;
    }
}