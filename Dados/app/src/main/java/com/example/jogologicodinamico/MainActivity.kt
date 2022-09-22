package com.example.jogologicodinamico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        findViewById
         */

        //CHAMANDO O BUTTON D6
        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)


        buttonD6.setOnClickListener{
           // Toast.makeText(this, "Rolando Dados!", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }


        buttonD12.setOnClickListener{
            rolarDados(12)
        }

        buttonD20.setOnClickListener{
            rolarDados(20)
        }
    }

    private fun rolarDados(lados: Int) {
        //CRIAR NÚMERO ALEATÓRIO
        val numAleatorio = (1..lados).random()

        //PUXANDO O TEXTO
        val textDados = findViewById<TextView>(R.id.textDado)

        //GUARDANDO DENTRO DELE O TEXTO!
        textDados.text = numAleatorio.toString()
    }
}