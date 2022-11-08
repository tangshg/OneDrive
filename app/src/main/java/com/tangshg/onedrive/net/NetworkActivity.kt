package com.tangshg.onedrive.net

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tangshg.onedrive.databinding.ActivityNetworkBinding

class NetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNetworkBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}