package com.tangshg.onedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tangshg.onedrive.databinding.ActivityUitestBinding

class UITest : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityUitestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.buttonUi.setOnClickListener{
            if (binding.progressbarUi.visibility == View.VISIBLE){
                binding.progressbarUi.visibility = View.INVISIBLE
            }else{
                binding.progressbarUi.visibility = View.VISIBLE
            }
            binding.progressbarUi.progress = binding.progressbarUi.progress + 10

        }


    }

}