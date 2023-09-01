package com.example.android_deeplink_example

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_deeplink_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uri: Uri = intent.data ?: return finish()

        // Sample uri scheme - testapp://main?a=1&b=2
        binding.text.text = buildString {
            appendLine("uri = $uri")
            appendLine("a = ${uri.getQueryParameter("a")}")
            appendLine("b = ${uri.getQueryParameter("b")}")
        }
    }
}
