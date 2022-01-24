package com.example.recyclerviewtest1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest1.R
import com.example.recyclerviewtest1.data.User
import com.example.recyclerviewtest1.databinding.ItemListBinding

class UserRecyclerViewAdapter : RecyclerView.Adapter<UserRecyclerViewAdapter.MyViewHolder>() {

    private val userList = ArrayList<User>()

    class MyViewHolder(private val binding:ItemListBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(user:User){
            binding.apply {
                binding.user = user
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply { bind(userList[position]) }
    }

    override fun getItemCount(): Int = userList.size

    fun setItem(items: ArrayList<User>) {
        userList.clear()
        userList.addAll(items)
        notifyDataSetChanged()
    }
}


