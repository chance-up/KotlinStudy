package com.example.tapviewpager.adapter

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object BindingAdapter {

    @BindingAdapter("app:setFragment", "app:supportFragmentManager")
    fun setFragment(view:View, fragment : Fragment, supportFragment : FragmentManager){
        supportFragment.beginTransaction().replace(view.id,fragment).commit()
    }
}