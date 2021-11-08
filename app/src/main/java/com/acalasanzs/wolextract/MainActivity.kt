package com.acalasanzs.wolextract

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.NumberPicker
import androidx.databinding.DataBindingUtil
import com.acalasanzs.wolextract.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val selector:NumberPicker = findViewById(R.id.selector)
        selector.minValue = 0
        selector.maxValue = 2
        selector.displayedValues = arrayOf<String>("Español","English","Català")

    }
    private fun addNickname(view : View) {
    }

    private fun draw() {
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
    }
}