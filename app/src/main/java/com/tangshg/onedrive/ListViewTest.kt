package com.tangshg.onedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.tangshg.onedrive.databinding.ActivityListViewBinding
import com.tangshg.onedrive.databinding.ActivityUitestBinding

class ListViewTest : AppCompatActivity() {

    private val data = listOf("Apple", "Banana", "Orange", "Watermelon",
        "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
        "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape",
        "Pineapple", "Strawberry", "Cherry", "Mango")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1,data)

        binding.listTest.adapter = adapter


     }
}