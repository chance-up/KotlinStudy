package com.example.recyclerviewwithviewmodel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithviewmodel.R
import com.example.recyclerviewwithviewmodel.databinding.ItemListBinding
import com.example.recyclerviewwithviewmodel.model.User

// Listadapter를 써보기

class UserAdapter(): RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    var userList = mutableListOf<User>()

    class MyViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item:User){
            binding.apply {
                binding.user = item
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.MyViewHolder {
        return MyViewHolder(
            ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//            DataBindingUtil.inflate(
//                LayoutInflater.from(parent.context), R.layout.item_list, parent, false
//            )

        )
    }


    override fun onBindViewHolder(holder: UserAdapter.MyViewHolder, position: Int) {
        val user = userList[position]
        //holder.bind(user)
//        val listener = View.OnClickListener { it ->
//            Toast.makeText(it.context,"Clicked:"+user?.name, Toast.LENGTH_SHORT).show()
//        }

        holder.apply {
            if (user != null) {
                bind(user)
            }
            itemView.tag = user
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(data : ArrayList<User>){
        userList = data
    }




}