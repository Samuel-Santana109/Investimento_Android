package com.example.projeto_samuel

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class  menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //Encontra o layout principal de onde vai conectar o menu
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //Lozalizou o menu que é no arquivo menu.xml
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)
            return super.onCreateOptionsMenu(menu)
        }

     /*  override fun onPrepareOptionsMenu(menu: Menu): Boolean {

            val menuChecked = menu.findItem(R.id.curtoPrazo)
            if(menuChecked.isChecked){
                menuItem = menu.add("AD")
            }

            return super.onPrepareOptionsMenu(menu)
        }*/

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
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

}
