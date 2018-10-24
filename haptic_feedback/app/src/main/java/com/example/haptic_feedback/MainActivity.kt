package com.example.haptic_feedback

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.support.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.O)
    @RequiresApi(Build.VERSION_CODES.O)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vibe : Vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        btn.setOnClickListener {
            vibe.vibrate(150)
        }

        //vibe.vibrate(VibrationEffect.createOneShot(150, 10))
    }
}
