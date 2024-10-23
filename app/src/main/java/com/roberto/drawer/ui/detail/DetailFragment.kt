package com.roberto.drawer.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.roberto.drawer.AccesorioActivity
import com.roberto.drawer.R
import com.roberto.drawer.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val detalle = "Detalles de Accesorio"
        var costo: String
        var intent: Intent

        binding.imgAccesorio01.setOnClickListener {
            costo = "$600.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("imagen", R.drawable.moto2)
            startActivity(intent)
        }

        binding.imgAccesorio02.setOnClickListener {
            costo = "$175.00"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("imagen", R.drawable.moto3)
            startActivity(intent)
        }

        binding.imgAccesorio03.setOnClickListener {
            costo = "$315.50"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("imagen", R.drawable.moto4)
            startActivity(intent)
        }

        binding.imgAccesorio04.setOnClickListener {
            costo = "$2600.80"
            intent = Intent(activity, AccesorioActivity::class.java)
            intent.putExtra("detalle", detalle)
            intent.putExtra("costo", costo)
            intent.putExtra("imagen", R.drawable.moto5)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
