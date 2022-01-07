package org.techtown.recyclerviewwithdatabinding.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.techtown.recyclerviewwithdatabinding.R
import org.techtown.recyclerviewwithdatabinding.databinding.ItemListBinding
import org.techtown.recyclerviewwithdatabinding.model.User

class UserAdapter(val users:ArrayList<User>):RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(listener: View.OnClickListener, item:User){
            binding.apply {
                userItem = item
                binding.root.setOnClickListener(listener)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.MyViewHolder {
        return MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context), R.layout.item_list, parent, false
            )
        )
    }


    override fun onBindViewHolder(holder: UserAdapter.MyViewHolder, position: Int) {
        val user = users[position]
        val listener = View.OnClickListener { it ->
            Toast.makeText(it.context,"Clicked:"+user?.name, Toast.LENGTH_SHORT).show()
        }

        holder.apply {
            if (user != null) {
                bind(listener,user)
            }
            itemView.tag = user
        }
    }

    override fun getItemCount(): Int {
        return users.size
    }

}