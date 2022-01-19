//package com.example.recyclerviewtest1.adapter
//
//import androidx.recyclerview.widget.DiffUtil
//import com.example.recyclerviewtest1.data.Dog
//
//private class Diff(private val oldItems:List<Dog>, private val newItems:List<Dog>) : DiffUtil.Callback(){
//    override fun getOldListSize(): Int = oldItems.size
//
//    override fun getNewListSize(): Int = newItems.size
//
//    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
//        val oldItem = oldItems[oldItemPosition]
//        val newItem = newItems[newItemPosition]
//
//        return oldItem.breed == newItem.breed
//    }
//
//    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
//        val oldItem = oldItems[oldItemPosition]
//        val newItem = newItems[newItemPosition]
//
//        return oldItem == newItem
//
//    }
//}