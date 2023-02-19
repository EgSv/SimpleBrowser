package ru.startandroid.develop.simplebrowser

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Browser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        val webView: WebView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        val data:Uri? = intent.data
        webView.loadUrl(data.toString())
    }
}