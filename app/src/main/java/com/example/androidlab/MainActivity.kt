package com.example.androidlab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// 'AppCompatActivity' 를 상속받아 'MainActivity'라는 클래스 정의
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView() 함수는 매개변수에 지정한 내용을 액티비티 화면에 출력
//        setContentView(R.layout.activity_view_binding)
//        val textView1: TextView = findViewById(R.id.main_feature)
//        Log.d("MAIN/TEXTVIEW", textView1.toString())


//        // 바인딩 객체 획득
//        val binding = ActivityViewbindingBinding.inflate(layoutInflater)
//
//        // 액티비티 화면 출력
//        setContentView(binding.root)
//
//        // 뷰 객체 이용
//        binding.visibleBtn.setOnClickListener {
//            binding.targetView.visibility = View.VISIBLE
//        }
//
//        binding.invisibleBtn.setOnClickListener {
//            binding.targetView.visibility = View.INVISIBLE
//        }

        setContentView(R.layout.activity_kakao)
    }
}