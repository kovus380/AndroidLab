package com.example.event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.CompoundButton
import android.widget.Toast
import com.example.event.databinding.ActivityCheckoutBinding
import com.example.event.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
//    뒤로가기 버튼 누른 시각 저장 속성
    var initTime = 0L

//    멈춘 시각 저장하는 속성
    var pauseTime = 0L


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickListener()

//        val binding = ActivityCheckoutBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.checkbox.setOnCheckedChangeListener(object :
//            CompoundButton.OnCheckedChangeListener {
//            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
//                Log.d("kkang", "체크박스 클릭")
//            }
//        })
//        binding.button.setOnClickListener {
//            Log.d("kkang", "버튼 클릭~~!~!~!")
//        }
//        binding.button.setOnLongClickListener {
//            Log.d("kkang", "롱 클릭 이벤트")
//            true
//        }
    }

    private fun initClickListener(){
        binding.startButton.setOnClickListener {
            binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
            binding.chronometer.start()

            binding.stopButton.isEnabled = true
            binding.resetButton.isEnabled = true
            binding.startButton.isEnabled = false

        }

        binding.stopButton.setOnClickListener {
            pauseTime = binding.chronometer.base  - SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.stopButton.isEnabled = false
            binding.resetButton.isEnabled = true
            binding.startButton.isEnabled = true
        }

        binding.resetButton.setOnClickListener {
            pauseTime = 0L
            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.stopButton.isEnabled = true
            binding.resetButton.isEnabled = false
            binding.startButton.isEnabled = true
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode === KeyEvent.KEYCODE_BACK) {
//            뒤로가기 버튼을 처음 눌렀거나 누른 지 3초가 지났을 때
            Log.d("kkang", "현재 시간" + System.currentTimeMillis().toString())
            Log.d("kkang", "처음 시간" + initTime.toString())
             if (System.currentTimeMillis() - initTime > 3000) {
                 Toast.makeText(this, "종료하려면 한 번 더 눌러주세요!",
                     Toast.LENGTH_SHORT).show()
                 initTime = System.currentTimeMillis()
                 return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        when (event?.action) {
//            MotionEvent.ACTION_DOWN -> {
//                Log.d("kkang", "Touch down event 'x': ${event.x}, rawX: ${event.rawX}")
//            }
//            MotionEvent.ACTION_UP -> {
//                Log.d("kkang", "Touch up event 'x': ${event.x}, rawX: ${event.rawX}")
//            }
//        }
//        return super.onTouchEvent(event)
//    }
//
//    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//        when (keyCode) {
//            KeyEvent.KEYCODE_BACK -> Log.d("kkang", "뒤로가기 버튼")
//            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("kkang", "볼륨 업업")
//            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("kkang", "볼륨 다운 ㅜㅜ")
//        }
//        return super.onKeyDown(keyCode, event)
//    }
//
//    override fun onBackPressed() {
//        Log.d("kkang", "백 프레스 프레스 프레스")
//        super.onBackPressed()
//    }
//
//    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
//        Log.d("kkang", "onKeyUp")
//        return super.onKeyUp(keyCode, event)
//    }


}