package com.example.recyclerview2.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerview2.data.User

class MainViewModel : ViewModel() {
    private val _name = MutableLiveData<String>()
    val name : MutableLiveData<String> = _name

    private val _age = MutableLiveData<String>()
    val age :MutableLiveData<String> = _age

    private val _user = MutableLiveData<ArrayList<User>>()
    val user : LiveData<ArrayList<User>> = _user

    private var items = ArrayList<User>()

    init {
        items = arrayListOf(
            User(1,"Choi","31"),
            User(2,"Choi","32"),
            User(3,"Choi","33"),
        )
        _user.value = items
    }

    fun addUser(){
        val user = User(items.size+1,_name.value,_age.value)
        items.add(user)
        _user.value = items
    }

}