package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neobis_android_tour_guide.databinding.FragmentFitnessBinding
import com.example.neobis_android_tour_guide.databinding.FragmentFullInfoBinding
import com.example.neobis_android_tour_guide.databinding.FragmentRestaurantsBinding


class FullInfoFragment : Fragment() {

    private lateinit var binding: FragmentFullInfoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFullInfoBinding.inflate(inflater, container, false)
        return binding.root
    }
    companion object {
        fun newInstance(place: Place): FullInfoFragment {
            val args = Bundle().apply {
                putParcelable("place", place)
            }
            val fragment = FullInfoFragment()
            fragment.arguments = args
            return fragment
        }
    }
}