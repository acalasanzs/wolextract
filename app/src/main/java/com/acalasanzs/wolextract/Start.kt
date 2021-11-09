package com.acalasanzs.wolextract

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.acalasanzs.wolextract.databinding.FragmentStartBinding


class Start : Fragment() {
    private lateinit var startBinding: FragmentStartBinding
    val langArr: Array<String> = arrayOf("English","Español","Català")
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var selector: NumberPicker = requireView().findViewById(R.id.selector)
        selector.minValue = 0
        selector.value = 1
        selector.maxValue = 2
        selector.displayedValues = langArr
    }
    private fun set(language: String): wolLang {
        val languages: Map<String, wolLang> = mapOf(
            "en" to wolLang(
                "https://wol.jw.org/en/wol/publication/r1/lp-e/nwt",
                arrayOf(
                    "Genesis",
                    "Exodus",
                    "Leviticus",
                    "Numbers",
                    "Deuteronomy",
                    "Joshua",
                    "Judges",
                    "Ruth",
                    "1 Samuel",
                    "2 Samuel",
                    "1 Kings",
                    "2 Kings",
                    "1 Chronicles",
                    "2 Chronicles",
                    "Ezra",
                    "Nehemiah",
                    "Esther",
                    "Job",
                    "Psalms",
                    "Proverbs",
                    "Ecclesiastes",
                    "Song of Solomon",
                    "Isaiah",
                    "Jeremiah",
                    "Lamentations",
                    "Ezekiel",
                    "Daniel",
                    "Hosea",
                    "Joel",
                    "Amos",
                    "Obadiah",
                    "Jonah",
                    "Micah",
                    "Nahum",
                    "Habakkuk",
                    "Zephaniah",
                    "Haggai",
                    "Zechariah",
                    "Malachi",
                    "Matthew",
                    "Mark",
                    "Luke",
                    "John",
                    "Acts",
                    "Romans",
                    "1 Corinthians",
                    "2 Corinthians",
                    "Galatians",
                    "Ephesians",
                    "Philippians",
                    "Colossians",
                    "1 Thessalonians",
                    "2 Thessalonians",
                    "1 Timothy",
                    "2 Timothy",
                    "Titus",
                    "Philemon",
                    "Hebrews",
                    "James",
                    "1 Peter",
                    "2 Peter",
                    "1 John",
                    "2 John",
                    "3 John",
                    "Jude",
                    "Revelation"
                ),
                "Índices"
            ),
            "es" to wolLang(
                "https://wol.jw.org/es/wol/publication/r4/lp-s/nwt",
                arrayOf(
                    "Génesis",
                    "Éxodo",
                    "Levítico",
                    "Números",
                    "Deuteronomio",
                    "Josué",
                    "Jueces",
                    "Rut",
                    "1 Samuel",
                    "2 Samuel",
                    "1 Reyes",
                    "2 Reyes",
                    "1 Crónicas",
                    "2 Crónicas",
                    "Esdras",
                    "Nehemías",
                    "Ester",
                    "Job",
                    "Salmos",
                    "Proverbios",
                    "Eclesiastés",
                    "El Cantar de los Cantares",
                    "Isaías",
                    "Jeremías",
                    "Lamentaciones",
                    "Ezequiel",
                    "Daniel",
                    "Oseas",
                    "Joel",
                    "Amós",
                    "Abdías",
                    "Jonás",
                    "Miqueas",
                    "Nahúm",
                    "Habacuc",
                    "Sofonías",
                    "Ageo",
                    "Zacarías",
                    "Malaquías",
                    "Mateo",
                    "Marcos",
                    "Lucas",
                    "Juan",
                    "Hechos",
                    "Romanos",
                    "1 Corintios",
                    "2 Corintios",
                    "Gálatas",
                    "Efesios",
                    "Filipenses",
                    "Colosenses",
                    "1 Tesalonicenses",
                    "2 Tesalonicenses",
                    "1 Timoteo",
                    "2 Timoteo",
                    "Tito",
                    "Filemón",
                    "Hebreos",
                    "Santiago",
                    "1 Pedro",
                    "2 Pedro",
                    "1 Juan",
                    "2 Juan",
                    "3 Juan",
                    "Judas",
                    "Apocalipsis"
                ),
                "Indexes"
            ),
            "cat" to wolLang(
                "https://wol.jw.org/cat/wol/publication/r55/lp-an/bi7",
                arrayOf(
                    "Mateu",
                    "Marc",
                    "Lluc",
                    "Joan",
                    "Fets",
                    "Romans",
                    "1 Corintis",
                    "2 Corintis",
                    "Gàlates",
                    "Efesis",
                    "Filipencs",
                    "Colossencs",
                    "1 Tessalonicencs",
                    "2 Tessalonicencs",
                    "1 Timoteu",
                    "2 Timoteu",
                    "Titus",
                    "Filemó",
                    "Hebreus",
                    "Jaume",
                    "1 Pere",
                    "2 Pere",
                    "1 Joan",
                    "2 Joan",
                    "3 Joan",
                    "Judes",
                    "Apocalipsi"
                ),
                "Índexs"
            )
        )
        return languages[language]!!
        }
    }