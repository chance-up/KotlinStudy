package com.example.searchbookkakao.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.searchbookkakao.data.Book
import com.example.searchbookkakao.databinding.BookListBinding

class BookRecyclerViewAdapter:ListAdapter<Book,BookRecyclerViewAdapter.MyViewHolder>(diffUtil) {

    class MyViewHolder(private val binding : BookListBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(book:Book){
            binding.book = book
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(
            BookListBinding.inflate(
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


    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Book>() {
            override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
                return oldItem.thumbnail == newItem.thumbnail
            }
        }
    }
}