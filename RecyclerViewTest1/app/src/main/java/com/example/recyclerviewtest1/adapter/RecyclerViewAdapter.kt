package com.example.recyclerviewtest1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest1.R
import com.example.recyclerviewtest1.data.User

class RecyclerViewAdapter() : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    private val userList = ArrayList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val userPhoto: ImageView = itemView?.findViewById<ImageView>(R.id.user_image)
        private val userName: TextView = itemView?.findViewById<TextView>(R.id.user_name)
        private val userAge: TextView = itemView?.findViewById<TextView>(R.id.user_age)

        fun bind(user: User) {
            userPhoto.setImageResource(R.drawable.ic_android_black_24dp)
            userName.text =user.name
            userAge.text = user.age
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply { bind(userList[position]) }
    }

    override fun getItemCount(): Int = userList.size

    fun setItem(items: ArrayList<User>) {
        val diffCallback = UserDiffCallback(userList, items)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        userList.clear()
        userList.addAll(items)
        diffResult.dispatchUpdatesTo(this)
    }


    inner class UserDiffCallback(private val oldList: ArrayList<User>, private val newList: ArrayList<User>) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition].id == newList[newItemPosition].id
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }
    }



}
