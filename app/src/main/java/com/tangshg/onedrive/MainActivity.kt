package com.tangshg.onedrive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 :Button = findViewById(R.id.button1)

        button1.setOnClickListener{
            Toast.makeText(this,"button1",Toast.LENGTH_LONG).show()

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