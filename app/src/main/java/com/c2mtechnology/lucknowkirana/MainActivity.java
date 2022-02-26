package com.c2mtechnology.lucknowkirana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView wv1;
    private String url = "https://lucknowkirana01.myomni.in/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        WebView browser = (WebView) findViewById(R.id.webview);
//        browser.loadUrl("https://www.lucknowkirana.com");

        wv1 = (WebView)findViewById(R.id.webview);
        wv1.setWebViewClient(new LucknowKirana(this));

        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setAllowContentAccess(true);
        wv1.getSettings().setDomStorageEnabled(true);
        wv1.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wv1.getSettings().setGeolocationEnabled(true);

        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl(url);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wv1.canGoBack()) {
            wv1.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);

    }
}