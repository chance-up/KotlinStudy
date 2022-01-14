package com.example.tabwithviewpager2.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.tabwithviewpager2.R
import com.example.tabwithviewpager2.adapter.ViewPagerAdapter
import com.example.tabwithviewpager2.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var fragmentStartBinding : FragmentStartBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentStartBinding = FragmentStartBinding.inflate(inflater,container,false)
        return fragmentStartBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentStartBinding.button.text = "ttttt"
        setupViewPager2()
    }

    private fun setupViewPager2() {
        val fragmentList = arrayListOf<Fragment>(
            FirstFragment.newInstance(),
            SecondFragment.newInstance(),
            ThirdFragment.newInstance()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity()
        )
        fragmentStartBinding.viewPager.adapter = adapter
        fragmentStartBinding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.e("ViewPagerFragment", "Page ${position+1}")
            }
        })

    }

}