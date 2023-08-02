package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neobis_android_tour_guide.databinding.ActivityMainBinding
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding

private const val ARG_PARAM1 = "param1"


class RestaurantsFragment : Fragment() {

    private lateinit var binding: FragmentRestaurantsBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentRestaurantsBinding.inflate(inflater, container, false)
        binding.recyclerRestaurants.layoutManager = LinearLayoutManager(requireContext())
        val list = arrayListOf(Place(R.drawable.photo_pushkin, getString(R.string.name_restaurant_pushkin),
            getString(R.string.address_restaurant_pushkin), getString(R.string.opening_restaurant_pushkin),
                getString(R.string.km_restaurant_pushkin), getString(R.string.check_restaurant_pushkin),
                    getString(R.string.kitchen_restaurant_pushkin), getString(R.string.fullDiscription_restaurant_pushkin)),
            Place(R.drawable.photo_sahalin, getString(R.string.name_restaurant_sahalin),
                getString(R.string.address_restaurant_sahalin), getString(R.string.opening_restaurant_sahalin),
                getString(R.string.km_restaurant_sahalin), getString(R.string.check_restaurant_sahalin),
                getString(R.string.kitchen_restaurant_sahalin), getString(R.string.fullDiscription_restaurant_sahalin)))
        binding.recyclerRestaurants.adapter = RecyclerViewAdapter(list)
            return binding.root
    }
}