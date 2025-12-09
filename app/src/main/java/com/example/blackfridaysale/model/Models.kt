package com.example.blackfridaysale.model

import androidx.annotation.DrawableRes

enum class SupportedLanguage(val code: String, val displayName: String, val flagEmoji: String) {
    ENGLISH("en", "English", "🇺🇸"),
    SPANISH("es", "Español", "🇪🇸"),
    ARABIC("ar", "العربية", "🇦🇪")
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
