package com.example.navpractice.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.navpractice.R
import com.example.navpractice.databinding.FragmentPageYBinding

class PageY : Fragment() {

    private lateinit var binding: FragmentPageYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageYBinding.inflate(inflater, container, false)


        val backBtn = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Navigation.findNavController(binding.root).navigate(R.id.action_pageY_to_mainPage)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backBtn)
        return binding.root
    }
}