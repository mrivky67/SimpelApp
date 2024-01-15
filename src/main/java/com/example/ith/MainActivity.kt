package com.example.ith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    //mendeklarasi webview
    lateinit var webView:WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        webView = findViewById(R.id.WV)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://simpel.ith.ac.id")

        // websetting
        val webSettings = webView.settings

        // mengaktifkan java script dan bootsrap/css
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true



    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        } else{
            super.onBackPressed()
        }


    }
}