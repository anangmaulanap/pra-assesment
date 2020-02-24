package id.co.imastudio.santri.kotlin1.mvplatihan

import android.annotation.SuppressLint
import android.os.Bundle


import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_persegi_panjang.*
import org.d3if410093.praassesmen.R

@SuppressLint("Registered")
class PersegiPanjangActivity : AppCompatActivity(), PresenterView {
    override fun segitiga(nilai: String) {
        txtHasil1.text=nilai
    }

    override fun persegi(nilai: String) {
        txtHasil1.text=nilai
    }

    override fun persegipanjang(nilai: String) {
        txtHasil1.text=nilai
    }

    var presenter2 : Presenter2?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)
        btnHitung1.setOnClickListener{
            presenter2?.Hitung2(edt1.text.toString(),edt2.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        presenter2 = Presenter2(this)
    }
}
