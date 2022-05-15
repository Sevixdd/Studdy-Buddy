package com.example.studybuddy;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    private WebView wView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        wView=(WebView) findViewById(R.id.webview);
        wView.setWebViewClient(new WebViewClient());
        wView.getSettings().setJavaScriptEnabled(true);
        wView.getSettings().setDisplayZoomControls(true);
        wView.loadUrl("file:///android_asset/index.html");


    }

}
