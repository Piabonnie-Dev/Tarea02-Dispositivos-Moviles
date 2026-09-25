package com.example.tarea02

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class CharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_character)
        //Componentes de la pantalla
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val tvTipo = findViewById<TextView>(R.id.tvTipo)
        val tvCancion = findViewById<TextView>(R.id.tvCancion)

        val tvNombrePersonaje = findViewById<TextView>(R.id.tvNombrePersonaje)
        val tvDescription = findViewById<TextView>(R.id.tvDescripcion)
        val imgPersonaje = findViewById<ImageView>(R.id.imgPersonaje)

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

//Recibir personaje seleccionado desde MainActivity

        val nombre = intent.getStringExtra("nombre") ?: "Usuario"
        val cancion = intent.getStringExtra("Cancion") ?: ""

        val personaje = intent.getStringExtra("personaje") ?: "Hatsune Miku"

        //Mostrar datos
        tvSaludo.text = "Hola, $nombre"
        tvNombrePersonaje.text = personaje

        if (cancion.isEmpty()) {
            tvCancion.text = "No especificaste una canción"
        } else {
            tvCancion.text = cancion
        }


        //Informacion segun el personaje
        when (personaje) {
            "Hatsune Miku" -> {

                tvTipo.text = "Vocaloid"

                tvDescription.text =
                    "Hatsune Miku es uno de los personajes de sintesis de voz mas conocidos."

                colocarImagen(imgPersonaje, "miku")

            }

            "Kasane Teto" -> {
                tvTipo.text ="Cantante virtual"

                tvDescription.text =
                    "Kasane Teto es una cantante virtual que varias ocasiones, compite contra Miku en popularidad"

                colocarImagen(imgPersonaje, "teto")

            }

            "Akita Neru" -> {
                tvTipo.text = "Personaje derivado"
                tvDescription.text =
                    "Akita Neru es un personaje igual conocido, pero con menos apariciones en canciones vs Teto y Miku."
colocarImagen(imgPersonaje, "neru")
            }

            "Defoko" -> {

                tvTipo.text = "UTAU"

                tvDescription.text = "Defoko es uno de los personajes asociados con UTAU."
colocarImagen( imgPersonaje, "defoko")
            }

            "GUMI" -> {
                tvTipo.text = "Vocaloid"

                tvDescription.text =
                    "GUMI es una cantante virtual conocida por participar en numerosas canciones."

                colocarImagen(imgPersonaje, "gumi")
            }

            "Adachi Rei" -> {

                tvTipo.text ="Cantante Virtual"

                tvDescription.text =
                    "Adachi Rei es una cantante virtual y personaje de síntesis de voz."

                colocarImagen(imgPersonaje, "adachi_rei")
            }

        }





        btnRegresar.setOnClickListener { finish() }
    }
        private fun colocarImagen(imageView: ImageView, nombreImagen: String) {
            val idImagen = resources.getIdentifier(nombreImagen, "drawable", packageName)
            if (idImagen != 0) {
                imageView.setImageResource(idImagen)
            } else {
                imageView.setImageResource(R.mipmap.ic_launcher)

            }

        }
    }
