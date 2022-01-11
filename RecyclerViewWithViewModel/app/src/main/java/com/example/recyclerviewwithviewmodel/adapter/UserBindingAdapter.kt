package com.example.recyclerviewwithviewmodel.adapter

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithviewmodel.model.User

object UserBindingAdapter {
    @BindingAdapter("items")
    @JvmStatic
    fun setItems(recyclerView: RecyclerView,items : ArrayList<User>){

        if(recyclerView.adapter ==null){
            recyclerView.adapter = UserAdapter()
        }
        Log.d("ccs","ccsccs")

        val userAdapter = recyclerView.adapter as UserAdapter
        userAdapter.userList = items
        userAdapter.notifyDataSetChanged()

    }


}