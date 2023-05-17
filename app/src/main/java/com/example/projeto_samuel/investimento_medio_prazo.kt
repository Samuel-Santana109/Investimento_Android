package com.example.projeto_samuel

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load


class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     investimento_medio_prazo : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.investimento_medio_prazo)

            /*val imageMenu = findViewById<ImageView>(R.id.)
            imageMenu.load((""))*/

            val imageUm = findViewById<ImageView>(R.id.imagemMedioUm)
            imageUm.load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSe8P9h5hDtVuJGIWcUpbg8f3bBFEgm5T6NSQ&usqp=CAU")

            val imagemMediDois = findViewById<ImageView>(R.id.imagemMediDois)
            imagemMediDois.load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBsGD0XtTwWGXbMhW3XrNoUjh8cpoip3hIsg&usqp=CAU")

            val imagemMedioTres = findViewById<ImageView>(R.id.imagemMedioTres)
            imagemMedioTres.load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRphh2z_mpFov5_rZNmyKAmTXfJewN-M4G1qg&usqp=CAU")




        }
    }
