package com.example.notification

import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    //    @TargetApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val status =
            ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION")
        if (status == PackageManager.PERMISSION_GRANTED) {
            Log.d("kkang", "11 - permission granted")
        } else {
            Log.d("kkang", "22 - permission denied")
            ActivityCompat.requestPermissions(this, arrayOf<String>("android.permission.ACCESS_FINE_LOCATION"), 100)
        }

//        val myToast = Toast.makeText(this.applicationContext, "", Toast.LENGTH_SHORT)
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
////        myToast.addCallback(
//    }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Log.d("kkang", "permission granted")
        } else {
            Log.d("kkang", "permission denied")
        }
    }
}