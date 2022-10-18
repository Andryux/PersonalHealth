package com.example.personalhealth.ui.diet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.personalhealth.Food
import com.example.personalhealth.R
import com.example.personalhealth.databinding.ActivityDietBinding

class DietActivity : AppCompatActivity() {

    private val dietViewModel: DietViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDietBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recycler = binding.nutrientsRecycler
        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = DietAdapter()
        recycler.adapter = adapter

        dietViewModel.nutrientsList.observe(this) { nutrientsList ->
            adapter.submitList(nutrientsList)
        }
    }
}