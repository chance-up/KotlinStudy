package com.example.roomwordsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.roomwordsample.databinding.FragmentFirstBinding
import kotlinx.coroutines.flow.combine

// TODO: Rename parameter arguments, choose names that match

class FirstFragment : Fragment() {
    lateinit var fragmentFirstBinding:FragmentFirstBinding
    //val repo : WordRepository = WordRepository
    private val wordViewModel:WordViewModel by viewModels()



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        fragmentFirstBinding = FragmentFirstBinding.inflate(inflater,container,false).apply {
            vm=wordViewModel
            lifecycleOwner=this@FirstFragment
        }
        return fragmentFirstBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val recyclerViewAdapter = WordListAdapter()
//        fragmentFirstBinding.recyclerview.adapter = recyclerViewAdapter
//        val words:ArrayList<Word> = arrayListOf(
//            Word("1111"),
//            Word("2222"),
//            Word("3333"),
//            Word("4444"),
//        )
//        recyclerViewAdapter.submitList(words)
//

    }


}