package com.example.neobis_android_tour_guide

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.databinding.ItemBinding

 class RecyclerViewAdapter (val places: List<Place>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        lateinit var binding: ItemBinding
        binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = places[position]
        holder.image.setImageResource (currentItem.image)
        holder.name.text = currentItem.name
        holder.address.text = currentItem.address
        holder.opening.text = currentItem.opening

    }

    class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val image: ImageView = binding.imageButton
        val name: TextView = binding.textNameItem
        val address: TextView = binding.textAddressItem
        val opening: TextView = binding.textOpeningItem
    }
}