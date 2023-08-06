package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neobis_android_tour_guide.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val tabLayout = binding.tabLayout
        val viewPager2 = binding.pager
        val tabArray = arrayOf(
            "Рестораны",
            "Фитнес центры",
            "Кинотеатры"
        )
        val adapter = SliderAdapter(parentFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = tabArray[position]
        }.attach()
        return binding.root
    }
}