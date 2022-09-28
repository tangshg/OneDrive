package com.tangshg.onedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.tangshg.onedrive.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSe.setOnClickListener{
            val data = intent.getStringExtra("data")

            Toast.makeText(this,"$data",Toast.LENGTH_LONG).show()
        }
    }
}