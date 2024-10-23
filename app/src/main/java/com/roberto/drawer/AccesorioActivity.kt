package com.roberto.drawer

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AccesorioActivity : AppCompatActivity() {

    private lateinit var descripcion: TextView
    private lateinit var imagen: ImageView
    private lateinit var btnRegresar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accesorio)

        // Vincular las vistas del layout con las variables
        descripcion = findViewById(R.id.txtDescripcion)
        imagen = findViewById(R.id.imgAccesorioDetalle)
        btnRegresar = findViewById(R.id.btnRegresar)

        // Obtener los datos enviados desde el fragment
        val infoRecibida = intent.extras
        val detalle: String?
        val costo: String?
        val imagenResId: Int

        if (infoRecibida != null) {
            detalle = infoRecibida.getString("detalle")
            costo = infoRecibida.getString("costo")
            imagenResId = infoRecibida.getInt("imagen")

            // Mostrar la descripción y la imagen correspondiente
            descripcion.text = "Descripción del producto:\n$detalle\nCosto: $costo"
            imagen.setImageResource(imagenResId) // Cargar la imagen recibida en el ImageView
        } else {
            // En el caso improbable de que no se pasen datos, mostrar texto genérico
            descripcion.text = "Descripción del producto:\nSin detalle\nCosto: $0.00"
        }

        // Configurar el botón para regresar a la pantalla anterior
        btnRegresar.setOnClickListener {
            finish() // Cierra la actividad y regresa al fragment anterior
        }
    }
}
