package com.example.neobis_android_tour_guide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neobis_android_tour_guide.databinding.FragmentFullInfoBinding

class FullInfoFragment : Fragment() {

    private lateinit var binding: FragmentFullInfoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFullInfoBinding.inflate(inflater, container, false)
        val place = arguments?.getParcelable<Place>("place")
        place?.address = binding.textAddress.text.toString()
        return binding.root
    }

}