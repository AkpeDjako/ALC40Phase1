package com.example.alc40phase1;

import android.webkit.WebView;
import android.webkit.WebViewClient;

abstract class MyWebViewClient extends WebViewClient {
    public abstract boolean shouldOverrideLoading(WebView view, String url);
}
