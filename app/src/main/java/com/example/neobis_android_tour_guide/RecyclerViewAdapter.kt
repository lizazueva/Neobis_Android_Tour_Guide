package com.example.neobis_android_tour_guide

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.neobis_android_tour_guide.databinding.FragmentFullInfoBinding
import com.example.neobis_android_tour_guide.databinding.ItemBinding

 class RecyclerViewAdapter (val places: List<Place>, val listener: OnItemClickListener) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

     interface OnItemClickListener {
         fun onItemClick(position: Int)
     }
     fun getItem(position: Int): Place {
         return places[position]
     }



     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        lateinit var binding: ItemBinding
        binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, listener)

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
        holder.cardItem.setOnClickListener {
            listener.onItemClick(position)
        }


    }

    class ViewHolder(private val binding: ItemBinding, private val listener: OnItemClickListener) : RecyclerView.ViewHolder(binding.root) {
        val image: ImageView = binding.imageButton
        val name: TextView = binding.textNameItem
        val address: TextView = binding.textAddressItem
        val opening: TextView = binding.textOpeningItem
        val cardItem: CardView = binding.cardItem
        init{
            cardItem.setOnClickListener{
                val position = adapterPosition
                listener.onItemClick(position)
            }
        }

    }
}