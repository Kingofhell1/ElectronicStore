package com.example.myapplication3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.Model.PopularModel
import com.example.myapplication3.databinding.ItemInListBinding

class PopularAdapter(val context: Context,
    val list:ArrayList<PopularModel>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
       val binding = ItemInListBinding.inflate(LayoutInflater.from(context), parent, false)
        return PopularViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PopularAdapter.PopularViewHolder, position: Int) {
        val listModel = list[position]
        holder.technicName.text = listModel.getTechnicName()
        holder.technicPrice.text = listModel.getTechnicPrice()
        listModel.getTechnicImage()?.let { holder.technicImage.setImageResource(it) }

    }

    override fun getItemCount(): Int {
        return list.size
    }
    class PopularViewHolder(binding: ItemInListBinding): RecyclerView.ViewHolder(binding.root){
        val technicImage = binding.itemListImage
        val technicName = binding.homeFoodName
        val technicPrice = binding.homePrice
    }

}