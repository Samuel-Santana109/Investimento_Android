package com.example.projeto_samuel

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import coil.load

class investimentosCurtoPrazo : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.investimentos_curto_prazo)


        val videoView = findViewById<VideoView>(R.id.videoView)
                val uri = Uri.parse("https://www.youtube.com/watch?v=NMTmXh4855c")
                videoView.setVideoURI(uri)

                val mediaController = MediaController(this)
                videoView.setMediaController(mediaController)
                mediaController.setAnchorView(videoView)



val imagemUm = findViewById<ImageView>(R.id.imagemUm)
imagemUm.load(("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzAz19KgWD3x6UVJdLDFxQqaPjtOpTSSwpkA&usqp=CAU"))

val imagemDois = findViewById<ImageView>(R.id.imagemDois)
imagemDois.load(("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS57nh_jHp8-v4UUJTHdNNxJ3V-dh16RTouBw&usqp=CAU"))

val imagemTres = findViewById<ImageView>(R.id.imagemTres)
imagemTres.load(("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS57nh_jHp8-v4UUJTHdNNxJ3V-dh16RTouBw&usqp=CAU"))

val imagemQuatro = findViewById<ImageView>(R.id.imagemQuatro)
imagemQuatro.load(("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0onrvxP7Ql-F_rIZJy6lly12yxxiF5wQDUA&usqp=CAU"))

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
                                intent = Intent(this, investimentosCurtoPrazo::class.java)
                                startActivity(intent)
                                true
                        }
                        R.id.medioPrazo -> {
                                intent = Intent(this, investimentoMedioPrazo::class.java)
                                startActivity(intent)
                                true
                        }
                        R.id.longoPrazo -> {
                                intent = Intent(this, investimentoLongoPrazo::class.java)
                                startActivity(intent)
                                true
                        }
                        R.id.activityMain -> {
                                intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                                true
                        }
                        else -> {
                                super.onOptionsItemSelected(item)
                        }
                }
        }


}

//SITE da toroInvestimentos.com
