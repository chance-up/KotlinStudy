package com.example.tabwithviewpager2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabwithviewpager2.ui.FirstFragment
import com.example.tabwithviewpager2.ui.SecondFragment
import com.example.tabwithviewpager2.ui.ThirdFragment

class ViewPagerAdapter(list : ArrayList<Fragment>, fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    //private var fragmentList : List<Fragment> = listOf(FirstFragment.newInstance(),SecondFragment.newInstance(),ThirdFragment.newInstance())
    private var fragmentList : ArrayList<Fragment> = list
    // 이렇게 선언하는 것이 맞는지?
    // 아래 것은 왜 안대는지?
//    private var fragmentList1 : MutableList<Fragment> = MutableList<Fragment>()


    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}