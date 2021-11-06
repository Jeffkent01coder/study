package com.jeff.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeff.study.databinding.ActivityRecyclerBinding

class Recycler : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myAdapter = MyAdapter()
        binding.recyclerView.apply {
            adapter = myAdapter
        }
    }
}