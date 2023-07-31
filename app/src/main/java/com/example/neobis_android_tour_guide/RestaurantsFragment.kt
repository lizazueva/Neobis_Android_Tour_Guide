package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neobis_android_tour_guide.databinding.ActivityMainBinding
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding

private const val ARG_PARAM1 = "param1"


class RestaurantsFragment : Fragment() {

    private lateinit var binding: FragmentRestaurantsBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentRestaurantsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}