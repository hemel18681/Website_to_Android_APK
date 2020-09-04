package com.example.hemel18681;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.DialogInterface;
import android.webkit.WebChromeClient;


public class MainActivity extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mywebView.getSettings();
        mywebView.loadUrl("https://hemel18681s.blogspot.com/");
        mywebView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);
    }
    public class myWebClient extends WebViewClient{
        @Override
        public void onPageStarted (WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed(){
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
