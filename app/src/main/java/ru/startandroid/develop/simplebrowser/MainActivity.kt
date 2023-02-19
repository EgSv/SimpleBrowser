package ru.startandroid.develop.simplebrowser

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnWeb).setOnClickListener(object : OnClickListener {
            override fun onClick(p0: View?) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ya.ru")))
            }
        })
    }
}