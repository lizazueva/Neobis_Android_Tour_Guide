package com.example.neobis_android_tour_guide

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.neobis_android_tour_guide.databinding.FragmentFullInfoBinding

class FullInfoFragment : Fragment() {

    private lateinit var binding: FragmentFullInfoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFullInfoBinding.inflate(inflater, container, false)

        val place = arguments?.getParcelable<Place>("place")
        var image = place?.image
        var name = place?.name
        var address = place?.address
        var opening = place?.opening
        var km = place?.km
        var check = place?.check
        var discription = place?.discription
        var fullDiscription = place?.fullDiscription
        val imageButton_back = binding.imageButtonBack
        binding.imagePushkin.setImageResource(image?:R.drawable.photo_pushkin)
        binding.textNameItem.text =name
        binding.textOpening.text =opening
        binding.textKm.text =km
        binding.textAddress.text =address
        binding.textCheck.text =check
        binding.textDiscription.text =discription
        binding.textFullDiscription.text =fullDiscription

        imageButton_back.setOnClickListener {
            val action = FullInfoFragmentDirections.navigateToMainFragment()
            findNavController().navigate(action)
        }
         binding.textAddress.setOnClickListener {
             val mapUri = Uri.parse("geo:0,0?q=${place?.address}")
             val intent = Intent(Intent.ACTION_VIEW, mapUri)
             startActivity(intent)
         }

        return binding.root
    }

}