
package com.example.tarea02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

// Adaptador para mostrar personajes con imagen y texto
class PersonajeAdapter(
    context: Context,
    private val personajes: Array<String>
) : ArrayAdapter<String>(context, 0, personajes) {

    // Imagen correspondiente a cada personaje
    private val imagenes = intArrayOf(
        R.drawable.miku,
        R.drawable.teto,
        R.drawable.neru,
        R.drawable.defoko,
        R.drawable.gumi,
        R.drawable.adachi_rei
    )

    // Clasificacion de los personajes
    private val tipos = arrayOf(
        "Vocaloid",
        "Cantante virtual",
        "Personaje derivado",
        "UTAU",
        "Vocaloid",
        "Cantante virtual"
    )

    // Construimos cada fila de la lista
    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        // Utilizamos nuestro diseño personalizado
        val fila = convertView ?: LayoutInflater.from(parent.context)
            .inflate(R.layout.item_personaje, parent, false)

        // Obtenemos los componentes de la fila
        val imagen = fila.findViewById<ImageView>(
            R.id.imgListaPersonaje
        )

        val nombre = fila.findViewById<TextView>(
            R.id.tvListaNombre
        )

        val tipo = fila.findViewById<TextView>(
            R.id.tvListaTipo
        )

        // Colocamos los datos del personaje
        imagen.setImageResource(imagenes[position])
        imagen.contentDescription = "Imagen de ${personajes[position]}"
        nombre.text = personajes[position]
        tipo.text = tipos[position]

        return fila
    }
}
