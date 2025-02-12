package com.roberto.drawer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.roberto.drawer.databinding.ActivityAccesorioBinding

class AccesorioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAccesorioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccesorioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras?.let {
            val detalle = it.getString("detalle") ?: "Sin detalle"
            val costo = it.getString("costo") ?: "$0.00"
            val imagenResId = it.getInt("imagen", R.drawable.ic_launcher_foreground)

            binding.txtDescripcion.text = "Descripción del producto:\n$detalle\nCosto: $costo"
            binding.imgAccesorioDetalle.setImageResource(imagenResId)
        }

        binding.btnRegresar.setOnClickListener { finish() }
    }
}
