package com.c2mtechnology.lucknowkirana;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LucknowKirana extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }


}
