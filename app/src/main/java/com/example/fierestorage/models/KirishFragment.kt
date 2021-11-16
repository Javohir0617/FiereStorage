package com.example.fierestorage.models

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fierestorage.R
import com.example.fierestorage.databinding.FragmentKirishBinding

class KirishFragment : Fragment() {
    lateinit var binding: FragmentKirishBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentKirishBinding.inflate(inflater, container, false)
        val string = arguments?.getString("key")
        binding.apply {
            telnumberTv.text = string.toString()

            image.setOnClickListener {
               Navigation.findNavController(requireView())
                   .popBackStack(R.id.homeFragment, false)
            }
        }
        return binding.root
    }
}