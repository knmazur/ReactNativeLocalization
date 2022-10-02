package com.babisoft.ReactNativeLocalization;

import android.content.Context;
import android.content.SharedPreferences;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by stefano on 20/09/15.
 */
public class ReactNativeLocalization extends ReactContextBaseJavaModule {

    private ReactNativeLocalizationImpl implementation;

    public ReactNativeLocalization(ReactApplicationContext reactContext) {
        super(reactContext);
        implementation = new ReactNativeLocalizationImpl(reactContext);
    }

    @Override
    public String getName() {
        return ReactNativeLocalizationImpl.NAME;
    }

    /**
     * Export to Javascript the variable language containing the current language
     *
     * @return
     */
    @Override
    public Map<String, Object> getConstants() {
        return implementation.getConstants();
    }

    /**
     * Export a method callable from javascript that returns the current language
     *
     * @param callback
     */
    @ReactMethod
    public void getLanguage(Callback callback) {
       implementation.getLanguage(callback);
    }
}
