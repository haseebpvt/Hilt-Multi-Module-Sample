package com.pensource.data

import android.content.SharedPreferences
import java.util.*
import javax.inject.Inject

interface StringHelper {
    fun capitalize(text: String): String
}

class DefaultStringHelper @Inject constructor(
    private val preferences: SharedPreferences
) : StringHelper {

    override fun capitalize(text: String): String {
        val capitalized = text.toUpperCase(Locale.US)

        with(preferences.edit()) {
            putString("last_word", capitalized)
            apply()
        }

        return capitalized
    }
}