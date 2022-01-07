package org.techtown.recyclerviewwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.techtown.recyclerviewwithdatabinding.adapter.UserAdapter
import org.techtown.recyclerviewwithdatabinding.databinding.ActivityMainBinding
import org.techtown.recyclerviewwithdatabinding.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // xml 파일명이 CamelCase 표기로 바뀌고 Binding이 붙습니다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity =this@MainActivity

        val users : ArrayList<User> = ArrayList()
        users.add(User(getDrawable(R.drawable.ic_android_black_24dp)!!,"user2","userid2"))
        users.add(User(getDrawable(R.drawable.ic_android_black_24dp)!!,"user3","userid3"))
        users.add(User(getDrawable(R.drawable.ic_android_black_24dp)!!,"user4","userid4"))
        users.add(User(getDrawable(R.drawable.ic_android_black_24dp)!!,"user5","userid5"))
        users.add(User(getDrawable(R.drawable.ic_android_black_24dp)!!,"user6","userid6"))
        users.add(User(getDrawable(R.drawable.ic_android_black_24dp)!!,"user7","userid7"))
        users.add(User(getDrawable(R.drawable.ic_android_black_24dp)!!,"user8","userid8"))

        val userAdapter = UserAdapter(users)
        binding.recyclerView.adapter = userAdapter

        userAdapter.notifyDataSetChanged()
    }
}