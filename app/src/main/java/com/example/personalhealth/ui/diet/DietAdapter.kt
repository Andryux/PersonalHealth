package com.example.personalhealth.ui.diet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.personalhealth.Nutrients
import com.example.personalhealth.databinding.NutrientsListItemBinding

class DietAdapter: ListAdapter<Nutrients, DietAdapter.NutrientViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<Nutrients>(){
        override fun areItemsTheSame(oldItem: Nutrients, newItem: Nutrients): Boolean {
            return oldItem === newItem
        }

        //Comprobar si siempre es necesario pasar un id o puede ser otro campo
        override fun areContentsTheSame(oldItem: Nutrients, newItem: Nutrients): Boolean {
            return oldItem.name == newItem.name
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NutrientViewHolder {
        val binding = NutrientsListItemBinding.inflate(LayoutInflater.from(parent.context))
        return NutrientViewHolder(binding)
    }

    override fun onBindViewHolder(nutrientViewHolder: NutrientViewHolder, position: Int) {
        val nutrient = getItem(position)
        nutrientViewHolder.bind(nutrient)
    }

    inner class NutrientViewHolder(private val binding: NutrientsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(nutrient: Nutrients){
                binding.nutrientName.text = nutrient.name
            }
    }
}
