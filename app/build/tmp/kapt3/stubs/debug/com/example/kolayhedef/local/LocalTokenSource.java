package com.example.kolayhedef.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/example/kolayhedef/local/LocalTokenSource;", "", "deleteUserAccessToken", "", "getUserAccessToken", "", "saveUserAccessToken", "", "token", "app_debug"})
public abstract interface LocalTokenSource {
    
    public abstract void saveUserAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUserAccessToken();
    
    public abstract boolean deleteUserAccessToken();
}