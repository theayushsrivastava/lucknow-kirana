package com.c2mtechnology.lucknowkirana;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LucknowKirana extends WebViewClient {
    Context context;

    public LucknowKirana(Context context) {
        this.context = context;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(url.equals("https://api.whatsapp.com/send?phone=917770099007&forceIntent=true&load=loadInIOSExternalSafari"))
        {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }else{
            view.loadUrl(url);
        }

        return true;
    }


}
