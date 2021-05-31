package com.example.mycontacts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EmergencyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_emergency,container,false);
//        WebView webView;
//        webView = v.findViewById(R.id.link);
//        webView.loadUrl("https://google.com");
//
//        // Enable Javascript
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//
//        // Force links and redirects to open in the WebView instead of in a browser
//        webView.setWebViewClient(new WebViewClient());

        return v;

    }


}
