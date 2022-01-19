package com.example.tapviewpager

import android.graphics.Color
import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.adapters.RadioGroupBindingAdapter
import com.example.tapviewpager.databinding.ActivityMainBinding
import com.example.tapviewpager.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            vm = mainViewModel
            supportFragmentmgr = supportFragmentManager
            lifecycleOwner = this@MainActivity
        }

        setContentView(binding.root)
        binding.tabLayout.addTab(binding.tabLayout.newTab(),true)
        binding.tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_android_black_24dp)
        //binding.tabLayout.getTabAt(0)?.customView?.setBackgroundColor(255)
        Log.e("ccs", binding.tabLayout.getChildAt(0).toString())
        Log.e("ccs", binding.tabLayout.getChildAt(0).background.toString())
        Log.e("ccs", binding.tabLayout.getTabAt(0).toString())
        binding.tabLayout.getChildAt(0).setBackgroundColor(200)
            //.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"))
        binding.tabLayout.addTab(binding.tabLayout.newTab(),false)
        binding.tabLayout.addTab(binding.tabLayout.newTab(),false)

        //supportFragmentManager

        //supportFragmentManager.beginTransaction().replace(binding.frameLayout.id,FirstFragment()).commit()

    }
}

