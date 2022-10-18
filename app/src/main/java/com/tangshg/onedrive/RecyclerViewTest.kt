package com.tangshg.onedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tangshg.onedrive.databinding.ActivityRecyclerViewTestBinding
import viewtest.Fruit
import viewtest.FruitAdapterRecycler

class RecyclerViewTest : AppCompatActivity() {
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRecyclerViewTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        val layoutManager = LinearLayoutManager(this)
        binding.viewRecycler.layoutManager = layoutManager
        val adapter = FruitAdapterRecycler(fruitList)
        binding.viewRecycler.adapter = adapter

    }

    private fun init(){
        repeat(4){
            for (i in 1..7){
                fruitList.add(Fruit("$i$i$i$i$i$i$i$i$i$i$i$i$i$i$i",R.drawable.logo))
            }
        }

    }
}