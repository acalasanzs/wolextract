package com.acalasanzs.wolextract

class wolLang(private var url:String,private var books:Array<String>,private var indexname:String) {
    override fun toString(): String {
        return "WOL Lang, url: $url, books: $books, indexname: $indexname"
    }
}