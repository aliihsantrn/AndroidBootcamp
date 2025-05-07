package com.example.navpractice.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navpractice.R
import com.example.navpractice.databinding.FragmentPageXBinding

class PageX : Fragment() {

    private lateinit var binding: FragmentPageXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageXBinding.inflate(inflater, container, false)

        binding.ButtonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pageX_to_pageY)
        }
        return binding.root
    }

}