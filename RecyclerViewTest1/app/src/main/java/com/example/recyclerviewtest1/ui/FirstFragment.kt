package com.example.recyclerviewtest1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.recyclerviewtest1.adapter.UserRecyclerViewAdapter
import com.example.recyclerviewtest1.data.User
import com.example.recyclerviewtest1.databinding.FragmentFirstBinding
import com.example.recyclerviewtest1.ui.viewmodel.FirstViewModel

class FirstFragment : Fragment() {
    lateinit var binding:FragmentFirstBinding
    private val firstViewModel:FirstViewModel by viewModels()

    var userNum:Int =10

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false).apply {
            vm=firstViewModel
            lifecycleOwner = this@FirstFragment
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{

            val userList = arrayListOf<User>(
                User(1,"Choi","31"),
                User(2,"Kim","28"),
                User(3,"Park","36"),
            )
            val recyclerViewAdapter = UserRecyclerViewAdapter()
            binding.recyclerView.adapter = recyclerViewAdapter

            recyclerViewAdapter.setItem(userList)




        }
    }
}