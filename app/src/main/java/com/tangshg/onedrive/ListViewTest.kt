package com.tangshg.onedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.tangshg.onedrive.databinding.ActivityListViewBinding
import com.tangshg.onedrive.databinding.ActivityUitestBinding
import viewtest.Fruit
import viewtest.FruitAdapter

class ListViewTest : AppCompatActivity() {

    private val data = listOf("Apple", "Banana", "Orange", "Watermelon",
        "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
        "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape",
        "Pineapple", "Strawberry", "Cherry", "Mango")

    private val fruitList = ArrayList<Fruit>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFruits()
        val listAdapter = FruitAdapter(this,R.layout.fruit_item,fruitList)
        binding.listTest.adapter = listAdapter

        val adapter = ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1,data)
        //binding.listTest.adapter = adapter

     }

    private fun initFruits() {
        repeat(2) {
            fruitList.add(Fruit("Apple"))
            fruitList.add(Fruit("Banana"))
            fruitList.add(Fruit("Orange"))
            fruitList.add(Fruit("Watermelon"))
            fruitList.add(Fruit("Pear"))
            fruitList.add(Fruit("Grape"))
            fruitList.add(Fruit("Pineapple"))
            fruitList.add(Fruit("Strawberry"))
            fruitList.add(Fruit("Cherry"))
            fruitList.add(Fruit("Mango"))

        }
    }
}