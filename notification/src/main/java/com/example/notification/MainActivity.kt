package com.example.notification

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.notification.databinding.ActivityDialogBinding

class MainActivity : AppCompatActivity() {
    //    @TargetApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
//        val inflater = getSystemService(Context.LAUNCHER_APPS_SERVICE) as LayoutInflater
//        val rootView = inflater.inflate(R.layout.activity_dialog, null)


        val binding = ActivityDialogBinding.inflate(layoutInflater)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            showToast()
        }

        val status =
            ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION")
        if (status == PackageManager.PERMISSION_GRANTED) {
            Log.d("kkang", "11 - permission granted")
        } else {
            Log.d("kkang", "22 - permission denied")
            ActivityCompat.requestPermissions(
                this,
                arrayOf<String>("android.permission.ACCESS_FINE_LOCATION"),
                100
            )
        }

//        val myToast = Toast.makeText(this.applicationContext, "", Toast.LENGTH_SHORT)
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
////        myToast.addCallback(
//    }

        val eventHandler = object : DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
                if (p1 == DialogInterface.BUTTON_POSITIVE) {
                    Log.d("kkang", "positive buttion click")
                } else if (p1 == DialogInterface.BUTTON_NEGATIVE) {
                    Log.d("kkang", "negative buttion click")
                }
            }
        }

        AlertDialog.Builder(this).run {
            setTitle("test dialog")
            setIcon(android.R.drawable.ic_dialog_info)
            setMessage("정말 종료?")
            setPositiveButton("OK", eventHandler)
            setNegativeButton("Cancel", eventHandler)
            setNeutralButton("More", eventHandler)
            show()
        }

        DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                Log.d("kkang", "year ${p1}, month ${p2 - 1}, dayOfMonth $p3")
            }
        }, 2020, 12, 21).show()

        TimePickerDialog(this, object : TimePickerDialog.OnTimeSetListener {
            override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
                Log.d("kkang", "time : $p1, minute : $p2")
            }
        }, 15, 0, false).show()

        val items = arrayOf<String>("복숭아", "자두", "블루베리", "체리")
        AlertDialog.Builder(this).run {
            setTitle("어떤 과일이 좋니?")
            setIcon(android.R.drawable.btn_star)
//            setItems(items, object: DialogInterface.OnClickListener {
//                override fun onClick(p0: DialogInterface?, p1: Int) {
//                    Log.d("kkang", "선택한 과일 : ${items[p1]}")
//                }
//            })

//            setMultiChoiceItems(items, booleanArrayOf(true, false, true, false), object: DialogInterface.OnMultiChoiceClickListener {
//                override fun onClick(p0: DialogInterface?, p1: Int, p2: Boolean) {
//                    Log.d("kkang", "${items[p1]} 이 ${if(p2) "선택되었습니다" else "선택해제되었습니다."}")
//                }
//            })

            setSingleChoiceItems(items, 1, object : DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Log.d("kkang", "${items[p1]} 이 선택되었습니다.")
                }
            })
            setCancelable(false)
            setPositiveButton("닫기", eventHandler)
            show()
        }.setCanceledOnTouchOutside(false)

        AlertDialog.Builder(this).run {
            setTitle("성별 궁금")
            setView(binding.root)
            setPositiveButton("닫기", null)
            show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun showToast() {
        val toast = Toast.makeText(this, "종료 한 번 더", Toast.LENGTH_LONG)
        toast.addCallback(
            object : Toast.Callback() {
                override fun onToastHidden() {
                    super.onToastHidden()
                    Log.d("kkang", "toast hidden")

                }

                override fun onToastShown() {
                    super.onToastShown()
                    Log.d("kkang", "toast shown")
                }
            }
        )
        toast.show()
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