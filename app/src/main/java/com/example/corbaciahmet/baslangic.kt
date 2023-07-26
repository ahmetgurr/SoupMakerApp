package com.example.corbaciahmet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.TextView


class baslangic : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)


        var yazi=findViewById<TextView>(R.id.textView)
        object :CountDownTimer(1000,65){
            var a=1
            override fun onTick(p0: Long) {
                yazi.setTextSize(a.toFloat())
                a = a + 3
            }

            override fun onFinish() {
                Handler().postDelayed(
                    {
                        var gecis = Intent(applicationContext, MainActivity::class.java)
                        startActivity(gecis)
                        finish()

                    },5000)
            }
        }.start()


            }
        }

