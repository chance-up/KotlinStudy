package com.example.wordroomsample1.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.wordroomsample1.R
import com.example.wordroomsample1.adapter.WordListAdapter
import com.example.wordroomsample1.data.Word
import com.example.wordroomsample1.data.WordDatabase
import com.example.wordroomsample1.databinding.FragmentWordBinding
import com.example.wordroomsample1.ui.viewModel.WordViewModel

class WordFragment : Fragment() {

    lateinit var binding: FragmentWordBinding
    private val wordViewModel:WordViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val wordDao = WordDatabase.getInstance(WordFragment().context)
        binding = FragmentWordBinding.inflate(inflater,container,false).apply {
            vm=wordViewModel
            lifecycleOwner=this@WordFragment
        }
        return binding.root
        //return inflater.inflate(R.layout.fragment_word, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.wordRecyclerView.adapter = WordListAdapter()


//        wordViewModel.selectWord.observe(viewLifecycleOwner, {
//            Log.e("css3", "$it")
//            WordListAdapter().submitList(it)
//        })
    }

}