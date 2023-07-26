package com.example.corbaciahmet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class siparisOzet : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siparis_ozet)
        val intent = intent
        var blink = findViewById<TextView>(R.id.button7)
        object : CountDownTimer(7000,500) {
            override fun onTick(p0: Long) {

                if (blink.visibility == View.VISIBLE ) {
                    blink.visibility = View.INVISIBLE
                } else {
                    blink.visibility = View.VISIBLE
                }
            }
            override fun onFinish() {
            }

        }.start()

        var yaz = findViewById<TextView>(R.id.textIcindekiler)
        var text = intent.getStringExtra("siparis")
        yaz.text = text

        var yaz2=findViewById<TextView>(R.id.textIstek)
        var text2=intent.getStringExtra("icindekiler")
        yaz2.text=text2

        var yaz3=findViewById<TextView>(R.id.textView12)
        var text3=intent.getStringExtra("extraistek")
        yaz3.text=text3

        var btn_yeni=findViewById<Button>(R.id.button7)
        var btn_cikis=findViewById<ImageButton>(R.id.imageButton2)



        btn_yeni.setOnClickListener{
            var gec= Intent(this,corba::class.java)
            startActivity(gec)
            finish()
        }
        btn_cikis.setOnClickListener{
            val alert= AlertDialog.Builder(this)

            alert.setCancelable(false)
            alert.setTitle("Çıkış")
            alert.setMessage("Çıkmak istediğinize emin misiniz")
            alert.setIcon(R.drawable.carpi)
            alert.setPositiveButton("Evet"){DialogInterface,i->
                finish()
            }
            alert.setNegativeButton("Hayır") { DialogInterface, i ->

            }
            alert.create().show()
        }

    }


}





