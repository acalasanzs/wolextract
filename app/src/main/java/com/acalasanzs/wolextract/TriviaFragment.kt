package com.acalasanzs.wolextract

import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.NumberPicker
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.animation.doOnEnd

class TriviaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_triva, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val valueAnimator = ValueAnimator.ofFloat(1f,0.65f)
        val banner: ImageView = requireView().findViewById(R.id.banner)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            banner.scaleX = value
            banner.scaleY = value
            banner.translationY -= 10
        }
        valueAnimator.interpolator = AccelerateInterpolator(1.5f)
        valueAnimator.duration = 700
        valueAnimator.start()



    }
}