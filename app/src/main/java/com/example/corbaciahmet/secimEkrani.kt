package com.example.corbaciahmet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class secimEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secim_ekrani)
        var seek =findViewById<SeekBar>(R.id.seekBar)
        var seek3 =findViewById<SeekBar>(R.id.seekBar3)
        val intent=intent
        var yaz=findViewById<TextView>(R.id.textView7)
        var text=intent.getStringExtra("aktar")
        yaz.text=text






        var buton5=findViewById<Button>(R.id.button5)

        seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 2) {
                    var uyari = AlertDialog.Builder(this@secimEkrani)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu kadar tuzlu istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.tuz)
                    uyari.setPositiveButton("Evet") { DialogInterface, i ->
                        Toast.makeText(applicationContext, "Bol Tuzlu Çorba", Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNegativeButton("Hayır") { DialogInterface, i ->
                        seek.progress=1
                    }
                    uyari.create().show()

                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
        seek3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if (p1 == 2) {
                    var uyari = AlertDialog.Builder(this@secimEkrani)
                    uyari.setTitle("Uyarı!")
                    uyari.setMessage("Bu kadar acı istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.aci)
                    uyari.setPositiveButton("Evet") { DialogInterface, i ->
                        Toast.makeText(this@secimEkrani, "Bol Acılı Çorba", Toast.LENGTH_LONG).show()
                    }
                    uyari.setNegativeButton("Hayır") { DialogInterface, i ->
                        seek3.progress=1
                    }
                    uyari.create().show()

                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        var sarimsak=findViewById<Switch>(R.id.sarimsak)
        var nane=findViewById<Switch>(R.id.nane)
        var dil=findViewById<Switch>(R.id.dil)
        var terbiye=findViewById<Switch>(R.id.terbiye)
        var sirke=findViewById<Switch>(R.id.sirke)
        var krema=findViewById<Switch>(R.id.krema)
        var yag=findViewById<Switch>(R.id.yag)
        var kasar=findViewById<Switch>(R.id.kasar)
        var kitir=findViewById<Switch>(R.id.kitir)
        var limon=findViewById<Switch>(R.id.limon)
        var biber=findViewById<Switch>(R.id.biber)
        var beyin=findViewById<Switch>(R.id.beyin)
        var extra=findViewById<EditText>(R.id.extra)

        if(text=="Ezogelin Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if(text=="Düğün Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        }
        if(text=="Mercimek Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if(text=="Brokoli Çorbası"){
            krema.visibility = View.VISIBLE


        }
        if(text=="Kelle-Paça Çorbası"){
            dil.visibility = View.VISIBLE
            sarimsak.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE


        }
        if(text=="Yayla Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if(text=="Şehriye Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if(text=="Domates Çorbası"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            terbiye.visibility=View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if(text=="Tarhana Çorbası"){
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if(text=="Mantar Çorbası"){
            kasar.visibility=View.VISIBLE

        }
        if(text=="İşkembe Çorbası"){
            sarimsak.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if(text=="Tavuk Çorbası"){
            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
        }

        buton5.setOnClickListener {
            var siparis=yaz.text.toString()
            var tuzmiktari = seek.progress.toString()
            var acımiktari =seek3.progress.toString()
            var sarimsakmiktari=sarimsak.isChecked.toString()
            var nanemiktari=nane.isChecked.toString()
            var dilmiktari=dil.isChecked.toString()
            var terbiyemiktari=terbiye.isChecked.toString()
            var sirkemiktari=sirke.isChecked.toString()
            var kremamiktari=krema.isChecked.toString()
            var yagmiktari=yag.isChecked.toString()
            var kasarmiktari=kasar.isChecked.toString()
            var kitirmiktari=kitir.isChecked.toString()
            var limonmiktari=limon.isChecked.toString()
            var bibermiktari=biber.isChecked.toString()
            var beyinmiktari=beyin.isChecked.toString()
            var extraistek=extra.text.toString()

            if(sarimsak.isChecked){
                sarimsakmiktari="sarımsak,"
            }else{
                sarimsakmiktari=""
            }
            if(nane.isChecked){
                nanemiktari="nane,"
            }else{
                nanemiktari=""
            }
            if(dil.isChecked){
                dilmiktari="dil,"
            }else{
                dilmiktari=""
            }
            if(terbiye.isChecked){
                terbiyemiktari="terbiye,"
            }else{
                terbiyemiktari=""
            }
            if(sirke.isChecked){
                sirkemiktari="sirke,"
            }else{
                sirkemiktari=""
            }
            if(krema.isChecked){
                kremamiktari="krema,"
            }else{
                kremamiktari=""
            }
            if(yag.isChecked){
                yagmiktari="yağ,"
            }else{
                yagmiktari=""
            }
            if(kasar.isChecked){
                kasarmiktari="kaşar,"
            }else{
                kasarmiktari=""
            }
            if(kitir.isChecked){
                kitirmiktari="kıtır,"
            }else{
                kitirmiktari=""
            }
            if(limon.isChecked){
                limonmiktari="limon,"
            }else{
                limonmiktari=""
            }
            if(biber.isChecked){
                bibermiktari="biber,"
            }else{
                bibermiktari=""
            }
            if(beyin.isChecked){
                beyinmiktari="beyin,"
            }else{
                beyinmiktari=""
            }


            if(seek.progress==0){
                tuzmiktari="Az Tuzlu"
            }
            if(seek.progress==1){
                tuzmiktari="Orta Tuzlu"
            }
            if(seek.progress==2){
                tuzmiktari="Bol Tuzlu"
            }
            if(seek3.progress==0){
                acımiktari="Az Acılı"
            }
            if(seek3.progress==1){
                acımiktari="Orta Acılı"
            }
            if(seek3.progress==2){
                acımiktari="Bol Acılı"
            }

            val uyar = AlertDialog.Builder(this)
            uyar.setTitle("Uyarı!")
            uyar.setMessage("Sparişiniz Hazırlanacak. Devam Etmek İstiyor musunuz?")
            uyar.setIcon(R.drawable.loggo)

            uyar.setNeutralButton("TEKRAR KONTROL ETMEK İSTİYORUM") { DialogInterface, i ->

            }
            uyar.setPositiveButton("EVET") { DialogInterface, i ->
                Handler().postDelayed({
                    var gecis = Intent(applicationContext, siparisOzet::class.java)
                    gecis.putExtra("siparis", "Bir " +siparis+ " Çeeek, "+tuzmiktari+" ve "+acımiktari+" Olsun")

                    gecis.putExtra("icindekiler",sarimsakmiktari+nanemiktari+dilmiktari+terbiyemiktari+sirkemiktari+kremamiktari+yagmiktari+kasarmiktari+kitirmiktari+limonmiktari+bibermiktari+beyinmiktari)

                    gecis.putExtra("extraistek", "Ekstra istek : "+extraistek)
                    startActivity(gecis)
                    finish()
                }, 0)
            }
            uyar.create().show()

        }
    }
}

