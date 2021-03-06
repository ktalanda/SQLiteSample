package com.example.datapersistancesample.presenter;

import android.support.annotation.CallSuper;

public class BasePresenter<V> {

    private V view;

    public BasePresenter() {
    }

    @CallSuper
    public void bind(V view) {
        if (this.view != null) {
           throw new RuntimeException("Concurrent view bind!");
        }
        this.view = view;
    }

    public void unbind() {
        this.view = null;
    }
}
