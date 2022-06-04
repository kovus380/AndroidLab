package com.example.androidlab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// 'AppCompatActivity' 를 상속받아 'MainActivity'라는 클래스 정의
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView() 함수는 매개변수에 지정한 내용을 액티비티 화면에 출력
        setContentView(R.layout.activity_test2)
//        val textView1: TextView = findViewById(R.id.main_feature)
//        Log.d("MAIN/TEXTVIEW", textView1.toString())
    }
}