package com.example.recyclerviewwithviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.recyclerviewwithviewmodel.adapter.UserAdapter
import com.example.recyclerviewwithviewmodel.databinding.ActivityMainBinding
import com.example.recyclerviewwithviewmodel.model.User
import com.example.recyclerviewwithviewmodel.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val userAdapter: UserAdapter by lazy {
        UserAdapter()
    }

    // ViewModelProvider 따로 안만들어줘도된다.
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.apply {
            viewModel = mainViewModel
            //recyclerView.adapter = userAdapter
            lifecycleOwner = this@MainActivity
        }


//        mainViewModel.userList.observe(this, Observer {
//            Log.e("PARK", "${it.size}")
//            userAdapter.setData(it)
//        })



//        binding.apply {
//            viewModel = mainViewModel
//            recyclerView.adapter = userAdapter
//            //lifecycleOwner = this@MainActivity
//        }
//
//
//        mainViewModel.userList.observe(this, Observer {
//            Log.e("PARK", "${it.size}")
//            userAdapter.setData(it)
//        })



//        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        userAdapter = UserAdapter()
//        binding.recyclerView.adapter = userAdapter
//
//        userAdapter.users = mutableListOf(
//            User("user2","userid2","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733"),
//            User("user3","userid3","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733")
//        )
//
//        binding.buttonSave.setOnClickListener {
//            userAdapter.users.add(User("testId","testName","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733"))
//        }


//
//        // 뷰모델 연결
//        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        binding.viewModel = mainViewModel
//
//        mainViewModel.userList.observe(this, Observer {
//            UserAdapter().setData(it)
//            }
//        )

//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.activity =this@MainActivity
//
//        val users : ArrayList<User> = ArrayList()
//        users.add(User("user2","userid2","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733"))
//        users.add(User("user3","userid3","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733"))
//
//        val userAdapter = UserAdapter(users)
//        binding.recyclerView.adapter = userAdapter
//
//        binding.buttonSave.setOnClickListener {
//
//        }
//
//        // 하기 함수를 사용하는 이유?
//        userAdapter.notifyDataSetChanged()
    }
}