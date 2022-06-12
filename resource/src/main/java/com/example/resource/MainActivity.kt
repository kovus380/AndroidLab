package com.example.resource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.example.resource.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = getString(R.string.app_name)
        binding.textView.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_bg_color, null))
        binding.textView.setTextSize(resources.getDimension(R.dimen.txt_size))
        binding.imageView.setImageDrawable(ResourcesCompat.getDrawable(resources, android.R.drawable.alert_dark_frame, null))
        binding.textView.text = getString(android.R.string.unknownName)
    }
}