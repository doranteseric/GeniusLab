package com.migpardo.geniuslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    public ScrollView blahScroll;
    TextView blah;
    DisplayMetrics display;
    int width;
    int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = this.getResources().getDisplayMetrics();
        width = display.widthPixels;
        height = display.heightPixels;

        //example = (RelativeLayout) findViewById(R.id.HeaderScroll);
        //blahScroll = (ScrollView) findViewById(R.id.blahScroll);
        //blah = (TextView) findViewById(R.id.BasicInfoText);

        mWebView = (WebView) findViewById(R.id.mainWebView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new MyAppWebViewClient());
        mWebView.loadUrl("https://forums.bladeandsoul.com");
    }
}