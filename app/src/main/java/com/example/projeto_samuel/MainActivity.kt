package com.example.projeto_samuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
import android.widget.TextView
import com.example.projeto_samuel.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu, menu)*/



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
        intent = Intent(this, investimentosCurtoPrazo::class.java)
        startActivity(intent)
    }

     fun paginaMedioPrazo() {
         intent = Intent(this, investimentoMedioPrazo::class.java)
        startActivity(intent)
    }

     fun paginaLongPrazo() {
          intent = Intent(this, investimentoLongoPrazo::class.java)
        startActivity(intent)
    }



}


//SITE da toroInvestimentos.com
