package com.tangshg.onedrive

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tangshg.onedrive.databinding.ActivityTestFragmentBinding
import com.tangshg.onedrive.databinding.FragmentLeftBinding

class FragmentTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTestFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val binding1 = FragmentLeftBinding.inflate(layoutInflater)
        binding1.leftFragButton.setOnClickListener {
            replace(AnotherLeftFragment())
            Toast.makeText(this, "button", Toast.LENGTH_SHORT).show()
        }
        replace(AnotherLeftFragment())
    }

    //动态切换 fragment
    fun replace(fragment: Fragment) {
        //获取 fragment 管理器
        val fragmentManager = supportFragmentManager
        //使用 fragment 开启一个事务
        val transaction = fragmentManager.beginTransaction()
        //使用事务中的 replace 方法替换原有的 fragment
        transaction.replace(R.id.rightLayout, fragment)
        //提交事务
        transaction.commit()
    }
}