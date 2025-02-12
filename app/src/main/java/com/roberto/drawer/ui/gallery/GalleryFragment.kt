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

        val accesorios = listOf(
            binding.imgAccesorio01 to (R.drawable.moto2 to "$600.00"),
            binding.imgAccesorio02 to (R.drawable.moto3 to "$175.00"),
            binding.imgAccesorio03 to (R.drawable.moto4 to "$315.50"),
            binding.imgAccesorio04 to (R.drawable.moto5 to "$2600.80")
        )

        accesorios.forEach { (imageView, data) ->
            val (imagen, costo) = data
            imageView.setOnClickListener {
                Toast.makeText(requireContext(), "Abriendo detalles...", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, AccesorioActivity::class.java).apply {
                    putExtra("detalle", detalle)
                    putExtra("costo", costo)
                    putExtra("imagen", imagen)
                }
                startActivity(intent)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
