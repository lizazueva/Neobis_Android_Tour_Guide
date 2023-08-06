package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neobis_android_tour_guide.databinding.FragmentFitnessBinding
import com.example.neobis_android_tour_guide.databinding.FragmentFullInfoBinding
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding

class FitnessFragment : Fragment(), RecyclerViewAdapter.OnItemClickListener {
    private lateinit var binding: FragmentFitnessBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFitnessBinding.inflate(inflater, container, false)
        binding.recyclerFitness.layoutManager = LinearLayoutManager(requireContext())
        val list = arrayListOf(
            Place(R.drawable.photo_fitness_zebra, getString(R.string.name_fitness_zebra),
                getString(R.string.address_fitness_zebra), getString(R.string.opening_fitness_zebra),
                getString(R.string.km_fitness_zebra), getString(R.string.check_fitness_zebra),
                getString(R.string.discription_fitness_zebra), getString(R.string.fullDiscription_fitness_zebra)),
            Place(R.drawable.photo_fitness_ohana, getString(R.string.name_fitness_ohana),
                getString(R.string.address_fitness_ohana), getString(R.string.opening_fitness_ohana),
                getString(R.string.km_fitness_ohana), getString(R.string.check_fitness_ohana),
                getString(R.string.discription_fitness_ohana), getString(R.string.fullDiscription_fitness_ohana)),
            Place(R.drawable.photo_fitness_world_class, getString(R.string.name_fitness_world_class),
                getString(R.string.address_fitness_world_class), getString(R.string.opening_fitness_world_class),
                getString(R.string.km_fitness_world_class), getString(R.string.check_fitness_world_class),
                getString(R.string.discription_fitness_world_class), getString(R.string.fullDiscription_fitness_world_class)))
        binding.recyclerFitness.adapter = RecyclerViewAdapter(list, this)
        return binding.root
    }
    override fun onItemClick(place: Place) {
        val action = MainFragmentDirections.actionMainFragmentToFullInfoFragment(place)
        findNavController().navigate(action)
    }
}