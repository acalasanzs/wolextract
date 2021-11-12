package com.acalasanzs.wolextract

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.acalasanzs.wolextract.databinding.FragmentHomeBinding
import com.acalasanzs.wolextract.databinding.FragmentStartBinding

class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)
        binding.trivia.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_home3_to_triviaFragment)
        }
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var book: NumberPicker = requireView().findViewById(R.id.book)
        book.minValue = 0
        book.maxValue = 1
        book.displayedValues = arrayOf("Genesis","Éxodo")
        var chapter: NumberPicker = requireView().findViewById(R.id.chapter)
        chapter.minValue = 1
        chapter.maxValue = 20
        var verse: NumberPicker = requireView().findViewById(R.id.verse)
        verse.minValue = 1
        verse.maxValue = 20

    }
}