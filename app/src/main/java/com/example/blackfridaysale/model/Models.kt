package com.example.blackfridaysale.model

import androidx.annotation.DrawableRes
import com.example.blackfridaysale.R

enum class SupportedLanguage(val code: String, val displayName: String, @DrawableRes val flagResId: Int) {
    ENGLISH("en", "English", R.drawable.flag_en),
    SPANISH("es", "Español", R.drawable.flag_es),
    ARABIC("ar", "العربية", R.drawable.flag_ar)
}

data class LocalizedText(
    val en: String,
    val es: String,
    val ar: String,
)

fun LocalizedText.forLanguage(lang: SupportedLanguage): String = when (lang) {
    SupportedLanguage.ENGLISH -> en
    SupportedLanguage.SPANISH -> es
    SupportedLanguage.ARABIC -> ar
}

data class Product(
    val id: Int,
    val name: LocalizedText,
    val basePriceUsd: Double,
    val discountPercent: Int,
    @DrawableRes val imageResId: Int
)
