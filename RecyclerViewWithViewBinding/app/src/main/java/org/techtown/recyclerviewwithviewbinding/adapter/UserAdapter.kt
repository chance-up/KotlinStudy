package org.techtown.recyclerviewwithviewbinding.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.techtown.recyclerviewwithviewbinding.R
import org.techtown.recyclerviewwithviewbinding.databinding.ItemListBinding
import org.techtown.recyclerviewwithviewbinding.model.User

class UserAdapter(private val users:ArrayList<User>):RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    class MyViewHolder(private val itemListBinding: ItemListBinding):RecyclerView.ViewHolder(itemListBinding.root) {


        fun bind(listener: View.OnClickListener, item:User){

            // private val itemListBinding 에서 private val을 안붙였더니, 아래 소스코드 에러가 났다. 이유는 무엇일까?

            itemListBinding.imageView.setImageDrawable(item.image)
            itemListBinding.userId.text = item.id
            itemListBinding.userName.text = item.name
            itemListBinding.root.setOnClickListener(listener)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.MyViewHolder {
        //val inflaterView = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        //return UserAdapter.MyViewHolder(inflaterView)
        val inflaterView = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserAdapter.MyViewHolder(inflaterView)
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