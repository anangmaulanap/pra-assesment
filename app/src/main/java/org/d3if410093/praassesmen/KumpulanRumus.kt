package id.co.imastudio.santri.kotlin1.mvplatihan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle


import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_kumpulan_rumus.*
import org.d3if410093.praassesmen.R

@SuppressLint("Registered")
class KumpulanRumus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kumpulan_rumus)
            segitiga.setOnClickListener{
                val intent = Intent(applicationContext, SegitigaActivity::class.java)
                startActivity(intent)
            }

            persegipanjang.setOnClickListener{
                val intent2 = Intent(applicationContext,PersegiPanjangActivity::class.java)
                startActivity(intent2)
            }

            persegipanjang.setOnClickListener{
                val intent3 = Intent(applicationContext,PersegiPanjangActivity::class.java)
                startActivity(intent3)
            }

    }
}
