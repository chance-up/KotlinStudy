package com.example.recyclerview2.adapter

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.data.User

object BindingAdapter {

//    @BindingAdapter("items")
//    @JvmStatic
//    fun RecyclerView.setItems(userList : ArrayList<User>){
//        val adapter = UserRecyclerViewAdapter()
//        this.adapter = adapter
//        adapter.submitList(userList)
//    }

    @BindingAdapter("items")
    @JvmStatic
    fun <T>RecyclerView.setItems(userList : ArrayList<User>){
//        val adapter = UserRecyclerViewAdapter()
//        this.adapter = adapter
//        adapter.submitList(userList)
        (adapter as? ListAdapter<T, *>)?.submitList(networkStatus.data as MutableList<T>?)
    }

//    @BindingAdapter("items")
//    @JvmStatic
//    fun <T>RecyclerView.setItems(userList : ArrayList<User>){
//        (adapter as? ListAdapter<T, *>)?.submitList(networkStatus.data as MutableList<T>?)
//    }
}