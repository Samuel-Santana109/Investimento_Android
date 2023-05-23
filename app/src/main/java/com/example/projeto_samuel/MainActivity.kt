package com.example.projeto_samuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val curtoPrazoTextView = findViewById<TextView>(R.id.curtoPrazo)

        curtoPrazoTextView.setOnClickListener {
            paginaCurtoPrazo()
        }

        val medioPrazoTextView = findViewById<TextView>(R.id.medioPrazo)

        medioPrazoTextView.setOnClickListener {
            paginaMedioPrazo()
        }

        val longoPrazoTextView = findViewById<TextView>(R.id.longoPrazo)

        longoPrazoTextView.setOnClickListener {
            paginaLongPrazo()
        }

    }

    fun paginaCurtoPrazo() {
        val curtoPrazo = Intent(this, investimentos_curto_prazo::class.java)
        startActivity(curtoPrazo)
    }

    fun paginaMedioPrazo() {
        val medioPrazo = Intent(this, investimento_medio_prazo::class.java)
        startActivity(medioPrazo)
    }

    fun paginaLongPrazo() {
        val longoPrazo = Intent(this, investimento_longo_prazo::class.java)
        startActivity(longoPrazo)
    }
}


//SITE da toroInvestimentos.com
