package com.tangshg.onedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tangshg.onedrive.databinding.ActivityRecyclerViewTestBinding

class RecyclerViewTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRecyclerViewTestBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}