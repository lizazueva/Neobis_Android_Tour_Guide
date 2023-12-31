package com.example.neobis_android_tour_guide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding


class RestaurantsFragment : Fragment(), RecyclerViewAdapter.OnItemClickListener {

    private lateinit var binding: FragmentRestaurantsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentRestaurantsBinding.inflate(inflater, container, false)
        binding.recyclerRestaurants.layoutManager = LinearLayoutManager(requireContext())
        val list = arrayListOf(Place(R.drawable.photo_pushkin, getString(R.string.name_restaurant_pushkin),
            getString(R.string.address_restaurant_pushkin), getString(R.string.opening_restaurant_pushkin),
                getString(R.string.km_restaurant_pushkin), getString(R.string.check_restaurant_pushkin),
                    getString(R.string.discription_restaurant_pushkin), getString(R.string.fullDiscription_restaurant_pushkin)),
            Place(R.drawable.photo_sahalin, getString(R.string.name_restaurant_sahalin),
                getString(R.string.address_restaurant_sahalin), getString(R.string.opening_restaurant_sahalin),
                getString(R.string.km_restaurant_sahalin), getString(R.string.check_restaurant_sahalin),
                getString(R.string.discription_restaurant_sahalin), getString(R.string.fullDiscription_restaurant_sahalin)))
        binding.recyclerRestaurants.adapter = RecyclerViewAdapter(list, this)
        return binding.root
    }

    override fun onItemClick(place: Place) {
        val action = MainFragmentDirections.actionMainFragmentToFullInfoFragment(place)
        findNavController().navigate(action)
    }
}