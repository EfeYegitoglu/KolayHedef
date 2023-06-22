package com.example.kolayhedef.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u000e\u0010\u0011\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kolayhedef/base/WrappedResponse;", "T", "", "success", "", "data", "error", "Lcom/example/kolayhedef/base/ErrorModel;", "(ZLjava/lang/Object;Lcom/example/kolayhedef/base/ErrorModel;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/example/kolayhedef/base/ErrorModel;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "(ZLjava/lang/Object;Lcom/example/kolayhedef/base/ErrorModel;)Lcom/example/kolayhedef/base/WrappedResponse;", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class WrappedResponse<T extends java.lang.Object> {
    private final boolean success = false;
    private final T data = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kolayhedef.base.ErrorModel error = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kolayhedef.base.WrappedResponse<T> copy(boolean success, T data, @org.jetbrains.annotations.NotNull()
    com.example.kolayhedef.base.ErrorModel error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WrappedResponse(boolean success, T data, @org.jetbrains.annotations.NotNull()
    com.example.kolayhedef.base.ErrorModel error) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final T component2() {
        return null;
    }
    
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kolayhedef.base.ErrorModel component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kolayhedef.base.ErrorModel getError() {
        return null;
    }
}