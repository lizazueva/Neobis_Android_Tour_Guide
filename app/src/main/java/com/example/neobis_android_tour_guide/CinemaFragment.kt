package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neobis_android_tour_guide.databinding.FragmentCinemaBinding

class CinemaFragment : Fragment(), RecyclerViewAdapter.OnItemClickListener {

    private lateinit var binding: FragmentCinemaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCinemaBinding.inflate(inflater, container, false)
        binding.recyclerCinema.layoutManager = LinearLayoutManager(requireContext())
        val list = arrayListOf(
            Place(
                R.drawable.photo_cinema_moscow,
                getString(R.string.name_cinema_moscow),
                getString(R.string.address_cinema_moscow),
                getString(R.string.opening_cinema_moscow),
                getString(R.string.km_cinema_moscow),
                getString(R.string.check_cinema_moscow),
                getString(R.string.discription_cinema_moscow),
                getString(R.string.fullDiscription_cinema_moscow)
            ),
            Place(
                R.drawable.photo_cinema_october,
                getString(R.string.name_cinema_october),
                getString(R.string.address_cinema_october),
                getString(R.string.opening_cinema_october),
                getString(R.string.km_cinema_october),
                getString(R.string.check_cinema_october),
                getString(R.string.discription_cinema_october),
                getString(R.string.fullDiscription_cinema_october)
            )
        )
        binding.recyclerCinema.adapter = RecyclerViewAdapter(list, this)
        return binding.root
    }

    override fun onItemClick(place: Place) {
        val action = MainFragmentDirections.actionMainFragmentToFullInfoFragment(place)
        findNavController().navigate(action)
    }
}