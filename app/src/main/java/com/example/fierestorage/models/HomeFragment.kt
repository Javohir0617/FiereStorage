package com.example.fierestorage.models

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fierestorage.R
import com.example.fierestorage.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonClick.setOnClickListener {
            val numbertel = binding.numberEt.text.toString()
            if (numbertel.isNotEmpty() || numbertel.length < 13) {
                val bundle = Bundle()
                bundle.putString("key", numbertel)
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_homeFragment_to_smsFragment, bundle)
                Toast.makeText(requireContext(), "SMS xabar yuborildi!!!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(requireContext(), "Raqamingizni kiriting", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.googleTv.setOnClickListener {
            Navigation.findNavController(requireView())
                .navigate(R.id.action_homeFragment_to_googleeFragment)
        }

        return binding.root

    }
}