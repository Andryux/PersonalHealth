package com.example.personalhealth.ui.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.personalhealth.databinding.ActivityDietBinding

class RecipesActivity : AppCompatActivity() {

    private val recipesViewModel: RecipesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDietBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recycler = binding.nutrientsRecycler
        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = RecipesAdapter()
        recycler.adapter = adapter

        recipesViewModel.nutrientsList.observe(this) { nutrientsList ->
            adapter.submitList(nutrientsList)
        }
    }
}