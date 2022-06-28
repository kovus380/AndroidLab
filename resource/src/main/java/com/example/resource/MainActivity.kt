package com.example.resource

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.resource.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.textView.text = getString(R.string.app_name)
//        binding.textView.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_bg_color, null))
//        binding.textView.setTextSize(resources.getDimension(R.dimen.txt_size))
//        binding.imageView.setImageDrawable(ResourcesCompat.getDrawable(resources, android.R.drawable.alert_dark_frame, null))
//        binding.textView.text = getString(android.R.string.unknownName)
    }
}