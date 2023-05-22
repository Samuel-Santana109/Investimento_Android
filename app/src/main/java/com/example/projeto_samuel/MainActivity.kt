package com.example.projeto_samuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun abrirOutraPagina() {
            val intent = Intent(this, investimentos_curto_prazo::class.java)
            startActivity(intent)
        }



    }
}


//SITE da toroInvestimentos.com
