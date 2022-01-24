package com.example.recyclerview2.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.data.User
import com.example.recyclerview2.databinding.ItemListBinding

class UserRecyclerViewAdapter :
    ListAdapter<User, UserRecyclerViewAdapter.MyViewHolder>(TermsListDiffCallback) {

    class MyViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.user = user
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
        holder.apply {
            bind(getItem(position))
        }
    }


    object TermsListDiffCallback : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            Log.e("ccs","areItemsTheSame :: ${oldItem == newItem}")
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            Log.e("ccs","areContentsTheSame :: ${oldItem.id == newItem.id}")
            return oldItem.id == newItem.id
        }
    }
}