package com.example.tarea02
import android.widget.ListView
import android.widget.ArrayAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Tarea03: Mostrar la lista de personajes

        val mostrarLista = true

        if(mostrarLista){
            setContentView(R.layout.activity_lista)

            //Obtenemos el ListView del archivo XML
            val lista = findViewById<ListView>(R.id.lvPersonajes)

            //Personajes que aparecen en la lista
            val personajes = arrayOf(
                "Hatsune Miku",
                "Kasane Teto",
                "Akita Neru",
                "Defoko",
                "GUMI",
                "Adachi Rei"

            )

            //Adaptador para mostrar los nombres
           val adaptador = PersonajeAdapter(this, personajes)

            lista.adapter = adaptador
            //Detectamos cuando se selecciona un personaje
            lista.setOnItemClickListener{
                    _, _, position, _ ->
                val seleccionado = personajes[position]

                Toast.makeText( this, "Seleccionaste a $seleccionado", Toast.LENGTH_SHORT).show()
            }
            return

        }

        setContentView(R.layout.activity_main)

        //Componentes de la primera pantalla
        val etCancion = findViewById<EditText>(R.id.etCancion)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val rgPersonajes = findViewById<RadioGroup>(R.id.rgPersonajes)
        val btnContinuar = findViewById<Button>(R.id.btnContinuar)

        btnContinuar.setOnClickListener{

            val nombre = etNombre.text.toString().trim()
            val cancion = etCancion.text.toString().trim()

            //Verificaque haya escrito su nombre
            if(nombre.isEmpty()){
                Toast.makeText(this,
                    "Escribe tu nombre",
                    Toast.LENGTH_SHORT).show()
                return@setOnClickListener

                }

            //Saber que personaje selecciono
            val personaje = when (rgPersonajes.checkedRadioButtonId){
                R.id.rbMiku -> "Hatsune Miku"
                R.id.rbTeto -> "Kasane Teto"
                R.id.rbNeru -> "Akita Neru"
                R.id.rbDefoko -> "Defoko"
                R.id.rbGumi -> "GUMI"
                R.id.rbAdachi -> "Adachi Rei"

                else -> ""


        }

            //Verifica que hayas seleccionado un personaje
            if(personaje.isEmpty()){
                Toast.makeText(this, "Selecciona un personaje", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//Abrir la segunda pantalla
            val intent = Intent(this, CharacterActivity::class.java)
//Mandamos informacion

            intent.putExtra("nombre", nombre)
            intent.putExtra("personaje", personaje)
            intent.putExtra("cancion", cancion)

            startActivity(intent)
        }
    }
}