package com.tangshg.onedrive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.tangshg.onedrive.databinding.ActivityMainBinding
import com.tangshg.onedrive.net.NetworkActivity

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

        binding.buttonNet.setOnClickListener{
            startActivity(Intent(this,NetworkActivity::class.java))
        }

        //region 打开 UITest 页面
        binding.buttonUitest.setOnClickListener{
            startActivity(Intent(this,UITest::class.java))
        }




        //endregion
        binding.button1.setOnClickListener{
           Toast.makeText(this,"button 1",Toast.LENGTH_SHORT).show()
        }
        binding.button2.setOnClickListener{
            val intent : Intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener{
            val intent : Intent = Intent("com.example.activitytest.ACTION_START")
            startActivity(intent)
            Toast.makeText(this,"隐式 intent " ,Toast.LENGTH_SHORT).show()
        }

        binding.button4.setOnClickListener{
            val intent : Intent = Intent("com.example.activitytest.ACTION_START")
            intent.addCategory("com.example.activitytest.MY_CATEGORY")
            startActivity(intent)
            Toast.makeText(this,"log",Toast.LENGTH_SHORT).show()
        }

        binding.button5.setOnClickListener{
            //利用 intent 向下一个 activity 传递数据
            val intent : Intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("data","data!!")
            startActivity(intent)
        }

        //先走一遍 startActivityForResult 熟悉流程
        binding.button6.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivityForResult(intent,1)
        }

        //startActivityForResult(intent,1) -> 这个方法已经 Google 废弃
        //所以使用 registerForActivityResult 来启动 Activity
        binding.button7.setOnClickListener{
            myActivityResultLauncher.launch(
                Intent(this,SecondActivity::class.java))
        }
    }

    //region startActivityForResult

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode ){
            1->if (resultCode== RESULT_OK){
                val resultData = data?.getStringExtra("return_data")
                Toast.makeText(this,"$resultData",Toast.LENGTH_SHORT).show()
            }

        }
    }
    //endregion


    //region registerForActivityResult

    private val myActivityResultLauncher =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
                result->
            val resultData = result.data?.getStringExtra("return_data")
            Toast.makeText(this,"$resultData",Toast.LENGTH_SHORT).show()
        }
    /*resultLauncher 用来启动活动
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>
    // launcherCallback 用来接收返回至此活动的数据
    // ActivityResultCallback 是一个接收 ActivityResult 类型

    //这里将接口“实例化了”，使用 lambda 来简化匿名内部类的使用

    private val launcherCallback = ActivityResultCallback<ActivityResult>{
            result->
        val code = result.resultCode
        val data = result.data
        if (code==1){
            println("$data")}
        Toast.makeText(this,"$data",Toast.LENGTH_SHORT).show()
    }
*/
    //endregion

    //region menu
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
    //endregion
}