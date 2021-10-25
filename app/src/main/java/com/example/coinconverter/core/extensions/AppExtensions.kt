package com.example.coinconverter.core.extensions

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.textfield.TextInputLayout
import java.text.NumberFormat
import java.util.*

var TextInputLayout.text: String
    get() = editText?.text?.toString() ?: ""
    set(value) {
        editText?.setText(value)
    }

fun View.hideSoftKeyboard() {
    val inn = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inn.hideSoftInputFromWindow(windowToken, 0)
}

fun Double.formatCurrency(locale: Locale = Locale.getDefault()): String{
    return NumberFormat.getCurrencyInstance(locale).format(this)
}