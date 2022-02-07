package com.example.wordroomsample1.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.wordroomsample1.data.Word


object BindingAdapter {

    @BindingAdapter("items")
    @JvmStatic
    fun RecyclerView.setItem(wordList:List<Word>?){
        (this.adapter as? WordListAdapter)?.submitList(wordList?.toMutableList())
    }
}