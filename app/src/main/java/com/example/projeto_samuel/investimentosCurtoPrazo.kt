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
                val uri = Uri.parse("https://www.youtube.com/watch?v=HO4lWzdPSkA&list=PPSV")
                videoView.setVideoURI(uri)

                val mediaController = MediaController(this)
                videoView.setMediaController(mediaController)
                mediaController.setAnchorView(videoView)



val imagemUm = findViewById<ImageView>(R.id.imagemUm)
imagemUm.load("data:image/jpeg;base64,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")

val imagemDois = findViewById<ImageView>(R.id.imagemDois)
imagemDois.load(("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV4kRWnh6gVYXZ733QVIgPnBzC9fgwWY4Mgg&usqp=CAU"))

val imagemTres = findViewById<ImageView>(R.id.imagemTres)
imagemTres.load(("https://icons8.com.br/icon/13132/m%C3%A9dia-2"))

val imagemQuatro = findViewById<ImageView>(R.id.imagemQuatro)
imagemQuatro.load(("data:image/jpeg;base64,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"))

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
                                val curtoPrazo = Intent(this, investimentosCurtoPrazo::class.java)
                                startActivity(curtoPrazo)
                                true
                        }
                        R.id.medioPrazo -> {
                                val medioPrazo = Intent(this, investimentoMedioPrazo::class.java)
                                startActivity(medioPrazo)
                                true
                        }
                        R.id.longoPrazo -> {
                                val longoPrazo = Intent(this, investimentoLongoPrazo::class.java)
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