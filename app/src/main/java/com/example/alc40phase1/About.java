package com.example.alc40phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.SslErrorHandler;
import android.net.http.SslError;

public class About extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.andela.com/alc");

        webView.setWebViewClient( new WebViewClient(){
           @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
               handler.proceed();
           }
        });


    }
}
