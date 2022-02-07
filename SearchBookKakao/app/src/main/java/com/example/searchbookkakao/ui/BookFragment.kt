package com.example.searchbookkakao.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.searchbookkakao.adapter.BookRecyclerViewAdapter
import com.example.searchbookkakao.databinding.FragmentBookBinding
import com.example.searchbookkakao.ui.viewmodel.BookViewModel

class BookFragment : Fragment() {

    lateinit var fragmentBookBinding: FragmentBookBinding
    private val bookViewModel: BookViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBookBinding = FragmentBookBinding.inflate(inflater,container,false).apply {
            vm=bookViewModel
            lifecycleOwner = this@BookFragment
        }
        return fragmentBookBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentBookBinding.recyclerViewBook.adapter = BookRecyclerViewAdapter()




    }

}