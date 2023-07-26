package com.example.corbaciahmet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var button1 = findViewById<Button>(R.id.button1)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)


        var tik_1 = findViewById<ImageView>(R.id.tik)
        var tik_2 = findViewById<ImageView>(R.id.tik1)
        var tik_3 = findViewById<ImageView>(R.id.tik2)
        var tik_4 = findViewById<ImageView>(R.id.tik3)
        var tik_5 = findViewById<ImageView>(R.id.tik4)

        var bar = findViewById<ProgressBar>(R.id.progressBar)

        button.setOnClickListener({
            if (tik_1.visibility == View.INVISIBLE) {
                tik_1.visibility = View.VISIBLE
            }
        })
        button1.setOnClickListener({
            if (tik_1.visibility == View.VISIBLE) {
                tik_2.visibility = View.VISIBLE
            }
        })
        button2.setOnClickListener({
            if (tik_1.visibility == View.VISIBLE && tik_2.visibility == View.VISIBLE) {
                tik_3.visibility = View.VISIBLE
            }
        })
        button3.setOnClickListener({
            if (tik_1.visibility == View.VISIBLE && tik_2.visibility == View.VISIBLE && tik_3.visibility == View.VISIBLE) {
                tik_4.visibility = View.VISIBLE
            }
        })

        button4.setOnClickListener({
            if (tik_1.visibility == View.VISIBLE && tik_2.visibility == View.VISIBLE && tik_3.visibility == View.VISIBLE && tik_4.visibility == View.VISIBLE) {
                tik_5.visibility=View.VISIBLE
                bar.visibility = View.VISIBLE
                Handler().postDelayed({
                    var gecis = Intent(this, corba::class.java)
                    startActivity(gecis)
                    finish();
                }, 3000)
            }
        })




    }
}