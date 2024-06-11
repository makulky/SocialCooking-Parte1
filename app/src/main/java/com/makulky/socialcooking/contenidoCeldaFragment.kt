package com.makulky.socialcooking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.makulky.socialcooking.databinding.FragmentContenidoCeldaBinding

class contenidoCeldaFragment : Fragment() {

    private var _binding: FragmentContenidoCeldaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContenidoCeldaBinding.inflate(inflater, container, false)

        val nombre = arguments?.getString("nombre")
        val autor = arguments?.getString("autor")
        val dificultad = arguments?.getString("dificultad")
        val urlFoto = arguments?.getString("urlFoto")

        binding.tituloRecetaCelda.text = nombre
        binding.autorRecetaCelda.text = autor
        binding.dificultadRecetaCelda.text = dificultad
        Glide.with(binding.imagenRecetaCelda.context).load(urlFoto).into(binding.imagenRecetaCelda)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
