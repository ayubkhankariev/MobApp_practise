package com.example.blackfridaysale.data

import com.example.blackfridaysale.R
import com.example.blackfridaysale.model.LocalizedText
import com.example.blackfridaysale.model.Product

object ProductsRepository {
    val products = listOf(
        Product(
            id = 1,
            name = LocalizedText("Running Shoes", "Zapatillas de correr", "حذاء رياضي"),
            basePriceUsd = 120.0,
            discountPercent = 30,
            imageResId = R.drawable.product_shoes
        ),
        Product(
            id = 2,
            name = LocalizedText("Leather Jacket", "Chaqueta de cuero", "سترة جلدية"),
            basePriceUsd = 250.0,
            discountPercent = 15,
            imageResId = R.drawable.product_jacket
        ),
        Product(
            id = 3,
            name = LocalizedText("Smart Watch", "Reloj inteligente", "ساعة ذكية"),
            basePriceUsd = 199.99,
            discountPercent = 20,
            imageResId = R.drawable.product_watch
        ),
        Product(
            id = 4,
            name = LocalizedText("Denim Jeans", "Pantalones vaqueros", "جينز"),
            basePriceUsd = 60.0,
            discountPercent = 10,
            imageResId = R.drawable.product_jeans
        ),
        Product(
            id = 5,
            name = LocalizedText("Sunglasses", "Gafas de sol", "نظارات شمسية"),
            basePriceUsd = 150.0,
            discountPercent = 50,
            imageResId = R.drawable.product_sunglasses
        ),
        Product(
            id = 6,
            name = LocalizedText("Backpack", "Mochila", "حقيبة ظهر"),
            basePriceUsd = 85.0,
            discountPercent = 25,
            imageResId = R.drawable.product_backpack
        ),
        Product(
            id = 7,
            name = LocalizedText("Wireless Headphones", "Auriculares inalámbricos", "سماعات لاسلكية"),
            basePriceUsd = 300.0,
            discountPercent = 40,
            imageResId = R.drawable.product_watch // Reusing watch image
        ),
        Product(
            id = 8,
            name = LocalizedText("Cotton T-Shirt", "Camiseta de algodón", "قميص قطني"),
            basePriceUsd = 25.0,
            discountPercent = 5,
            imageResId = R.drawable.product_jacket // Reusing jacket image
        )
    )
}
