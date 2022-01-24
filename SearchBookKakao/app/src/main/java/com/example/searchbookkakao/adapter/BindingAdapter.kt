package com.example.searchbookkakao.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.searchbookkakao.data.Book

object BindingAdapter {
    @BindingAdapter("items")
    @JvmStatic
    fun RecyclerView.setItems(books:ArrayList<Book>){
        (this.adapter as BookRecyclerViewAdapter).submitList(books.toMutableList())
    }

    @BindingAdapter("thumbnail")
    @JvmStatic
    fun ImageView.loadImage(imageUrl : String) {
        Glide.with(context)
            .load(imageUrl)
            .error(com.example.searchbookkakao.R.drawable.ic_android_black_24dp)
            .into(this)
    }
}