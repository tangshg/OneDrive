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

        val adapter = ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1,data)
        //binding.listTest.adapter = adapter

        init()
        val fruitAdapter  = FruitAdapter(this,R.layout.fruit_item,fruitList)

        binding.listTest.adapter = fruitAdapter
     }

    //向 Fruit 中装填图片和文字
    fun init(){
        repeat(4){
            for (i in 1..7){
                fruitList.add(Fruit("$i$i$i$i$i$i$i$i$i$i$i$i$i$i$i",R.drawable.logo))
            }
        }

    }

}
