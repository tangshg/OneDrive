package com.tangshg.onedrive

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tangshg.onedrive.databinding.ActivityListViewBinding
import viewtest.Fruit
import viewtest.FruitAdapter


class ListViewTest : AppCompatActivity() {

    private val data = listOf(
        "Apple", "Banana", "Orange", "Watermelon",
        "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
        "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape",
        "Pineapple", "Strawberry", "Cherry", "Mango"
    )

    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1, data
        )
        //binding.listTest.adapter = adapter

        init()
        val fruitAdapter = FruitAdapter(this, R.layout.fruit_item, fruitList)
        binding.listTest.adapter = fruitAdapter
        binding.listTest.setOnItemClickListener { _, _, position, _ ->
            val fruit = fruitList[position]
            Toast.makeText(this, fruit.name, Toast.LENGTH_SHORT).show()
        }

    }

    //向 Fruit 中装填图片和文字
    private fun init() {
        repeat(4) {
            for (i in 1..7) {
                fruitList.add(Fruit("$i$i$i$i$i$i$i$i$i$i$i$i$i$i$i", R.drawable.logo))
            }
        }

    }

}
