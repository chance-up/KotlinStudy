package com.example.kotlin1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1.model.User

class UserAdapter(): RecyclerView.Adapter<UserAdapter.MyViewHolder>(){
    var dataList = mutableListOf<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context
        )
    }

}