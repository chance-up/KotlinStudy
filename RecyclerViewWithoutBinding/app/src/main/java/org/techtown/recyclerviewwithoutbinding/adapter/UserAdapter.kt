package org.techtown.recyclerviewwithoutbinding.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.techtown.recyclerviewwithoutbinding.R
import org.techtown.recyclerviewwithoutbinding.model.User

class UserAdapter(private val users:ArrayList<User>?):RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    class MyViewHolder(v:View):RecyclerView.ViewHolder(v) {
        private var view: View = v

        fun bind(listener: View.OnClickListener, item:User){
            view.findViewById<ImageView>(R.id.imageView).setImageDrawable(item.image)
            view.findViewById<TextView>(R.id.userId).text = item.id
            view.findViewById<TextView>(R.id.userName).text = item.name
            view.setOnClickListener(listener)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.MyViewHolder {
        val inflaterView = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return UserAdapter.MyViewHolder(inflaterView)
    }

    override fun onBindViewHolder(holder: UserAdapter.MyViewHolder, position: Int) {
        val user = users?.get(position)
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
        return if(users?.size !=null){
            users?.size
        }else{
            0
        }
    }


}