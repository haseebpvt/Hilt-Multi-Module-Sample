package com.pensource.data

interface StringHelper {
    fun capitalize(text: String): String
}

class DefaultStringHelper : StringHelper {

    override fun capitalize(text: String): String {
        return text.toUpperCase()
    }
}