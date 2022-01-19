package com.example.recyclerviewtest1.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewtest1.data.User

class FirstViewModel:ViewModel() {


    // Two Way Binding 하려면, 선언을 어떻게 해야 하는가?
    private val _name = MutableLiveData<String>()
    val name : MutableLiveData<String> = _name

    private val _age = MutableLiveData<String>()
    val age : MutableLiveData<String> = _age


    // 이렇게 선언하는 이유 :
    // 이 ViewModel에서는 비즈니스 로직을 수행하면서 _name변수를 변경할것이다.(_name.value = "??")
    // 그리고 외부에다가는 name 변수를 보여줄것이다. observe되는 것도 이 변수이다.
    // 외부에선 set은 할 수 없고 오로지 get(Observe)만 하도록 하기 위함이다.
    private val _users = MutableLiveData<ArrayList<User>>()
    val users : LiveData<ArrayList<User>> = _users

    private var items = ArrayList<User>()

    init {
        items = arrayListOf<User>(
            User(1,"Kim","21"),
            User(2,"Park","24"),
            User(3,"Choi","30")
        )
        _users.value = items
    }

    fun addUser(){
        items.add(
            User((items.size+1),_name.value,_age.value)
        )
        Log.e("ccs","${_name.value}")
        Log.e("ccs","${_age.value}")
        _users.value = items
    }
}