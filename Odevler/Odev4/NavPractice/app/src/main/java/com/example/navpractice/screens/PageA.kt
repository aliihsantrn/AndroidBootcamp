package com.example.navpractice.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navpractice.R
import com.example.navpractice.databinding.FragmentPageABinding

class PageA : Fragment() {

    private lateinit var binding: FragmentPageABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageABinding.inflate(inflater, container, false)

        binding.ButtonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pageA_to_pageB)
        }
        return binding.root
    }
}