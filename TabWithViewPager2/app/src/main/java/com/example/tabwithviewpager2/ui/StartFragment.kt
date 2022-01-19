package com.example.tabwithviewpager2.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.tabwithviewpager2.R
import com.example.tabwithviewpager2.adapter.ViewPagerAdapter
import com.example.tabwithviewpager2.databinding.FragmentStartBinding
import com.google.android.material.tabs.TabLayoutMediator

class StartFragment : Fragment() {

    private lateinit var fragmentStartBinding : FragmentStartBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentStartBinding = FragmentStartBinding.inflate(inflater,container,false)
        return fragmentStartBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        connectViewPagerAndTabLayout()
    }

    fun addFragmentToViewPager(){
        val fragmentList = arrayListOf<Fragment>(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )

        val adapter = ViewPagerAdapter(fragmentList, requireActivity())
        fragmentStartBinding.viewPager.adapter = adapter
        fragmentStartBinding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.e("ViewPagerFragment", "Page ${position+1}")
            }
        })
    }

    fun connectViewPagerAndTabLayout(){
        val tabLayout = fragmentStartBinding.tabLayout
        val viewPager = fragmentStartBinding.viewPager

        addFragmentToViewPager()
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()
    }
}