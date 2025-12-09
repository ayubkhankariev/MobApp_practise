package com.example.blackfridaysale.data

import com.example.blackfridaysale.model.SupportedLanguage
import java.text.NumberFormat
import java.util.Locale

object PriceUtils {

    fun formatPrice(priceUsd: Double, language: SupportedLanguage): String {
        val (convertedPrice, locale) = when (language) {
            SupportedLanguage.ENGLISH -> Pair(priceUsd * 1.0, Locale.US)
            SupportedLanguage.SPANISH -> Pair(priceUsd * 0.93, Locale("es", "ES"))
            SupportedLanguage.ARABIC -> Pair(priceUsd * 3.67, Locale("ar", "AE"))
        }
        
        val formatter = NumberFormat.getCurrencyInstance(locale)
        return formatter.format(convertedPrice)
    }

    fun calculateNewPrice(basePriceUsd: Double, discountPercent: Int): Double {
        return basePriceUsd * (1 - discountPercent / 100.0)
    }
}
