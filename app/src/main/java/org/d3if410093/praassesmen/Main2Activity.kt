package id.co.imastudio.santri.kotlin1

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog


import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import org.d3if410093.praassesmen.R

@SuppressLint("Registered")
class Main2Activity : AppCompatActivity() {

   /* var edt1:EditText?=null
    var edt2:EditText?=null
    var btnHitung:Button?=null
    var btnPindah:Button?=null
    var txthsl:TextView?=null*/
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
/*

        edt1= findViewById(R.id.edt1) as EditText?
        edt2= findViewById(R.id.edt2) as EditText?
        txthsl= findViewById(R.id.txtHasil1) as TextView?
        btnHitung= findViewById(R.id.btnHitung1) as Button?
*/



       /* btnPindah= findViewById(R.id.btnPindah) as Button?*/
        btnPindah?.setOnClickListener{
            val intent = Intent(applicationContext,MainActivity::class.java)
            intent.putExtra("nilai1",edt1?.text.toString())
            intent.putExtra("nilai2",edt2?.text.toString())
            intent.putExtra("nilai3",txtHasil1?.text)
            startActivity(intent)
        }
        //btn hitung
        btnHitung1?.setOnClickListener{
            val nilai1 = edt1?.text.toString()
            val nilai2 = edt2?.text.toString()
            if (nilai1.isNotEmpty()&&nilai2.isNotEmpty()){
                //convert string menuju double
                val x = nilai1.toDouble()
                val y = nilai2.toDouble()
                //calcut
                val hasil = (x*y) /2
                //pindah ke textview
                txtHasil1?.setText("Hasilnya Adalah :" +hasil.toString())
                //pilihan ke 2
                //txthsl?.text = hasil.toString()

            } else{
                //deklarasi variabel dialog
                val alert = AlertDialog.Builder(this)
                alert.setTitle("Warning !!")
                alert.setMessage("tidak bisa kosng edittext")
                alert.setIcon(R.mipmap.ic_launcher)

                alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, _ ->
                    dialogInterface.dismiss()
                })
                alert.show()
            }


        }

    }
}
