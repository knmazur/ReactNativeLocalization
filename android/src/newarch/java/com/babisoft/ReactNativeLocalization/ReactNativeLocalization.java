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
public class ReactNativeLocalization extends NativeLocalizationSpec {
    private ReactNativeLocalizationImpl implementation;

    public ReactNativeLocalization(ReactApplicationContext reactContext) {
        super(reactContext);
        this.implementation = new ReactNativeLocalizationImpl(reactContext);
    }

    @Override
    public String getName() {
        return ReactNativeLocalizationImpl.NAME;
    }
    
    @Override
    public Map<String, Object> getTypedExportedConstants() {
        return implementation.getConstants();
    }

    @Override
    public void getLanguage(Callback callback) {
        implementation.getLanguage(callback);
    }
}
