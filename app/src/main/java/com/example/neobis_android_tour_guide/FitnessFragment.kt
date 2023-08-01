package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neobis_android_tour_guide.databinding.FragmentFitnessBinding
import com.example.neobis_android_tour_guide.databinding.FragmentFullInfoBinding

class FitnessFragment : Fragment() {
    private lateinit var binding: FragmentFitnessBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFitnessBinding.inflate(layoutInflater)
        return binding.root
    }
}