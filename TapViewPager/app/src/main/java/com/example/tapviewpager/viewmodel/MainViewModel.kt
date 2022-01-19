package com.example.tapviewpager.viewmodel

import android.widget.FrameLayout
import androidx.databinding.InverseMethod
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tapviewpager.ui.FirstFragment

class MainViewModel:ViewModel() {

    private val _ccsText = MutableLiveData<String>()
    val ccsText : MutableLiveData<String>
        get() = _ccsText

    private val _mainFragment= MutableLiveData<Fragment>()
    val mainFragment : MutableLiveData<Fragment>
        get()=  _mainFragment


    init {
        _mainFragment.value = FirstFragment()
        _ccsText.value = "12412411"
    }

}