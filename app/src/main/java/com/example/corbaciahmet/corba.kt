package com.example.corbaciahmet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class corba : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corba)

        var corbalar=findViewById<RadioGroup>(R.id.radioGroup)
        var devam=findViewById<Button>(R.id.devambtn)
        var corba_tiki=findViewById<CheckBox>(R.id.checkBox)

        corba_tiki.setOnClickListener({
            if(corba_tiki.isChecked){
                corbalar.visibility= View.VISIBLE
                devam.visibility=View.VISIBLE
            }
        })

        var control=0
        devam.setOnClickListener{
            var id:Int=corbalar.checkedRadioButtonId
            if(id!=-1){
                val radio:RadioButton=findViewById(id)
                var ozeltoast=layoutInflater.inflate(R.layout.toast_corba,null)
                var text2=ozeltoast.findViewById<TextView>(R.id.toastView)
                text2.text="${radio.text} Çorbası Güzel Seçim Lütfen Bekleyiniz"
                var toastozel=Toast(applicationContext)
                toastozel.view=ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration=Toast.LENGTH_LONG
                toastozel.show()
                Handler().postDelayed({
                    var gecis= Intent(this,secimEkrani::class.java)
                    gecis.putExtra("aktar","${radio.text} Çorbası")
                    startActivity(gecis)
                    finish();
                },3000)
                control=1
                //Toast.makeText(applicationContext,"${radio.text}"+" Çorbası Güzel Seçim Lütfen Bekleyiniz",Toast.LENGTH_SHORT).show()
            }
            if(control==0){
                val alert=AlertDialog.Builder(this)

                alert.setCancelable(false)
                alert.setTitle("Uyarı!")
                alert.setMessage("Lütfen Seçiminizi Yapınız")
                alert.setIcon(R.drawable.loggo)
                alert.setNeutralButton("Tekrar Dene"){DialogInterface,i->

                }
                alert.create().show()
            }
        }


        }


    }


