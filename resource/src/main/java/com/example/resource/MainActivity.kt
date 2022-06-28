package com.example.resource

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.resource.databinding.ActivityTestBinding

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityTestBinding.inflate(layoutInflater)
//        val displayMetrics = DisplayMetrics()
//        display?.getRealMetrics(displayMetrics)
//        binding.TextView?.text = "widthPixels : ${displayMetrics.widthPixels}"
        setContentView(binding.root)
//        binding.textView.text = getString(R.string.app_name)
//        binding.textView.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_bg_color, null))
//        binding.textView.setTextSize(resources.getDimension(R.dimen.txt_size))
//        binding.imageView.setImageDrawable(ResourcesCompat.getDrawable(resources, android.R.drawable.alert_dark_frame, null))
//        binding.textView.text = getString(android.R.string.unknownName)
    }
}