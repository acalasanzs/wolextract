package com.acalasanzs.wolextract

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker

class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
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