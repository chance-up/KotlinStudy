package com.example.tabwithviewpager2.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tabwithviewpager2.R

class SplashFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
//            if (isOnBoardingFinished()) {
//                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
//            } else {
//                findNavController().navigate(R.id.action_splashFragment_to_onBoardingFragment)
//            }
            findNavController().navigate(R.id.action_splashFragment_to_startFragment)
        }, 1500)
    }
}