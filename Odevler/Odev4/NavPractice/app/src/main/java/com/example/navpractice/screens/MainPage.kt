package com.example.navpractice.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navpractice.R
import com.example.navpractice.databinding.FragmentMainPageBinding

class MainPage : Fragment() {

    private lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        binding.ButtonA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainPage_to_pageA)
        }

        binding.ButtonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainPage_to_pageX)
        }

        return binding.root
    }
}