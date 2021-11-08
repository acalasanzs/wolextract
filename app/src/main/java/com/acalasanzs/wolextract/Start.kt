package com.acalasanzs.wolextract

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.acalasanzs.wolextract.databinding.FragmentStartBinding

class Start : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentStartBinding>(inflater, R.layout.fragment_start, container, false)
        binding.button.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_home2_to_home3)

        }
        return binding.root
    }
}