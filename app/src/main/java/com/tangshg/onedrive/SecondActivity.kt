package com.tangshg.onedrive

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tangshg.onedrive.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSe.setOnClickListener {
            val data = intent.getStringExtra("data")

            Toast.makeText(this, "$data", Toast.LENGTH_LONG).show()
        }


        binding.buttonSe1.setOnClickListener {
            val intent = Intent()
            intent.putExtra("return_data", "hello")
            setResult(RESULT_OK, intent)
            finish()
        }
        apply { }
        binding.buttonSe2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("return_data", "register")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}