package com.example.blackfridaysale.data

import com.example.blackfridaysale.model.LocalizedText
import com.example.blackfridaysale.model.Product

object ProductsRepository {
    val products = listOf(
        Product(
            id = 1,
            name = LocalizedText("Running Shoes", "Zapatillas de correr", "حذاء رياضي"),
            basePriceUsd = 120.0,
            discountPercent = 30,
            imageResId = android.R.drawable.ic_menu_camera // Placeholder
        ),
        Product(
            id = 2,
            name = LocalizedText("Leather Jacket", "Chaqueta de cuero", "سترة جلدية"),
            basePriceUsd = 250.0,
            discountPercent = 15,
            imageResId = android.R.drawable.ic_menu_gallery // Placeholder
        ),
        Product(
            id = 3,
            name = LocalizedText("Smart Watch", "Reloj inteligente", "ساعة ذكية"),
            basePriceUsd = 199.99,
            discountPercent = 20,
            imageResId = android.R.drawable.ic_menu_compass // Placeholder
        ),
        Product(
            id = 4,
            name = LocalizedText("Denim Jeans", "Pantalones vaqueros", "جينز"),
            basePriceUsd = 60.0,
            discountPercent = 10,
            imageResId = android.R.drawable.ic_menu_view // Placeholder
        ),
        Product(
            id = 5,
            name = LocalizedText("Sunglasses", "Gafas de sol", "نظارات شمسية"),
            basePriceUsd = 150.0,
            discountPercent = 50,
            imageResId = android.R.drawable.ic_menu_day // Placeholder
        ),
        Product(
            id = 6,
            name = LocalizedText("Backpack", "Mochila", "حقيبة ظهر"),
            basePriceUsd = 85.0,
            discountPercent = 25,
            imageResId = android.R.drawable.ic_menu_mylocation // Placeholder
        ),
        Product(
            id = 7,
            name = LocalizedText("Wireless Headphones", "Auriculares inalámbricos", "سماعات لاسلكية"),
            basePriceUsd = 300.0,
            discountPercent = 40,
            imageResId = android.R.drawable.ic_menu_call // Placeholder
        ),
        Product(
            id = 8,
            name = LocalizedText("Cotton T-Shirt", "Camiseta de algodón", "قميص قطني"),
            basePriceUsd = 25.0,
            discountPercent = 5,
            imageResId = android.R.drawable.ic_menu_sort_by_size // Placeholder
        )
    )
}
