package com.tangshg.onedrive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.tangshg.onedrive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* 原生方法加载布局
        setContentView(R.layout.activity_main)


        val button1 :Button = findViewById(R.id.button1)

        button1.setOnClickListener{
            Toast.makeText(this,"button1",Toast.LENGTH_LONG).show()

        }

         */

        //利用 ViewBinding 加载布局
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener{
           Toast.makeText(this,"button 1",Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener{
            var intent: Intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener{
            val intent : Intent = Intent("com.example.activitytest.ACTION_START")
            startActivity(intent)
            Toast.makeText(this,"隐式 intent " ,Toast.LENGTH_SHORT).show()
        }


    }
    // 这里只用来加载 menu 布局
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        //这里为什么可以直接使用getMenuInflater()，而不使用对象
        return true
    }

    //这里注册 menu 的点击事件
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item ->
                Toast.makeText(this,"add",Toast.LENGTH_LONG).show()
            R.id.remove_item ->
                Toast.makeText(this,"remove",Toast.LENGTH_LONG).show()
        }
        return true
    }

}