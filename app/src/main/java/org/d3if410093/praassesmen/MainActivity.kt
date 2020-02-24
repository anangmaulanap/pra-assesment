package id.co.imastudio.santri.kotlin1

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.d3if410093.praassesmen.R

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
@SuppressLint("Registered")
class MainActivity : AppCompatActivity() {
    var angka1 = 12
    var angka2 = 45
    var angka3 = 70

    var edt1: EditText?=null
    var edt2: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt1= findViewById(R.id.edt1) as EditText?
        edt2= findViewById(R.id.edt2) as EditText?

        val tangkap = intent.getStringExtra("nilai1")
        val tangkap2 = intent.getStringExtra("nilai2")
        val tangkap3 = intent.getStringExtra("nilai3")

        Toast.makeText(applicationContext,tangkap+tangkap2+tangkap3,Toast.LENGTH_SHORT).show()



        //calkulasi
        val hasil = angka1 * angka2 * angka3
        println(hasil)
        Log.d("hasilnya : " , hasil.toString())
        /*  //deklarasi id
          var edt1 = findViewById(R.id.edt_satu) as EditText
          var edt2 = findViewById(R.id.edt_dua) as EditText

          var btnTambah = findViewById(R.id.btntmbah) as Button
          var btnKurang = findViewById(R.id.btnkurang) as Button
          var btnKali = findViewById(R.id.btnkali) as Button
          var btnBagi = findViewById(R.id.btnbagi) as Button

          btnTambah.setOnClickListener{
              val nilai1 :String = edt1.text.toString();
              val nilai2 :String = edt2.text.toString();

              if (nilai1.isEmpty()&&nilai2.isEmpty()){
                  Toast.makeText(this,"Tidak bisa kosong",Toast.LENGTH_SHORT).show()

              }
          }*/
    }
}
