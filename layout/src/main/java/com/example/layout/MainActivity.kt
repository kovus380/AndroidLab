package com.example.layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_keypad)
//        val binding = ActivityFrameBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.button.setOnClickListener {
//            binding.imageView.visibility = View.VISIBLE
//            binding.button.visibility = View.INVISIBLE
//        }
//
//        binding.imageView.setOnClickListener {
//            binding.button.visibility = View.VISIBLE
//            binding.imageView.visibility = View.INVISIBLE
//        }

//        binding.button.setOnClickListener {
//            binding.imageView.visibility = View.INVISIBLE
//        }
    }
}