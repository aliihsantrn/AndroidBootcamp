package com.example.navpractice.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navpractice.R
import com.example.navpractice.databinding.FragmentMainPageBinding
import com.example.navpractice.databinding.FragmentPageBBinding

class PageB : Fragment() {

    private lateinit var binding: FragmentPageBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPageBBinding.inflate(inflater, container, false)

        binding.ButtonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pageB_to_pageY)
        }
        return binding.root
    }
}