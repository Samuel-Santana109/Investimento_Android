package com.example.projeto_samuel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
import android.widget.TextView
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {
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


  /*  override fun onCreateOptionsMenu(menu: Menu): Boolean {
        //val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }*/

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

    //Lozalizou o menu que é no arquivo menu.xml
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    //Direcionamentos para dos link quando forem clicados para as outras paginas
    override  fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.curtoPrazo -> {
                val curtoPrazo = Intent(this, investimentos_curto_prazo::class.java)
                startActivity(curtoPrazo)
                true
            }
            R.id.medioPrazo -> {
                val medioPrazo = Intent(this, investimento_medio_prazo::class.java)
                startActivity(medioPrazo)
                true
            }
            R.id.longoPrazo -> {
                val longoPrazo = Intent(this, investimento_longo_prazo::class.java)
                startActivity(longoPrazo)
                true
            }
            R.id.activityMain -> {
                val paginaPrincipal = Intent(this, MainActivity::class.java)
                startActivity(paginaPrincipal)
                true
            }
            else -> {
                false
                //super.onOptionsItemSelected(item)
            }
        }
    }
}


//SITE da toroInvestimentos.com
