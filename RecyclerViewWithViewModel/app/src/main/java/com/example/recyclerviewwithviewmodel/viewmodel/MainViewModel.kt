package com.example.recyclerviewwithviewmodel.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewwithviewmodel.model.User

class MainViewModel:ViewModel() {
    private val _userList = MutableLiveData<ArrayList<User>>()

    val userList : LiveData<ArrayList<User>>
        get() = _userList

    private var items = ArrayList<User>()

    init {
        items = arrayListOf(
            User("user1","userid1","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733"),
            User("user2","userid2","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733"),
            User("user3","userid3","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733")
        )
        _userList.value = items
    }

    fun buttonClick(){
        Log.e("PARK", "Button Click")
        val user = User("Test","TestName","https://t1.daumcdn.net/cfile/tistory/2511E03B577BB58733")
        items.add(user)
        _userList.value = items
    }
}