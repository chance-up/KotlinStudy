package com.example.recyclerviewtest1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclerviewtest1.adapter.RecyclerViewAdapter
import com.example.recyclerviewtest1.data.User
import com.example.recyclerviewtest1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding:FragmentFirstBinding
    var userNum:Int =10

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var userList = arrayListOf(
            User(1,"Kim", "25"),
            User(2,"Choi", "23"),
            User(3,"Park", "25"),
            User(4,"Jang", "26"),
            User(5,"Cho", "27"),
            User(6,"Han", "22"),
            User(7,"Yoon", "29"),
            User(8,"Lee", "30"),
            User(9,"Ko", "32"),
            User(10,"Koo", "36"),
        )

        binding = FragmentFirstBinding.inflate(inflater,container,false)

        val recyclerViewAdapter = RecyclerViewAdapter()

        binding.recyclerView.adapter = recyclerViewAdapter
        recyclerViewAdapter.setItem(userList)

        binding.button.setOnClickListener{
            userNum+=1
            val user = User(userNum,binding.editTextBreed.text.toString(),binding.editTextAge.text.toString())
            userList.add(user)
            recyclerViewAdapter.setItem(userList)
            recyclerViewAdapter.notifyDataSetChanged()
        }

        return binding.root
    }
}