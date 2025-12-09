package com.example.blackfridaysale.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.blackfridaysale.R

val HostGrotesk = FontFamily(
    Font(R.font.host_grotesk_regular, FontWeight.Normal),
    Font(R.font.host_grotesk_medium, FontWeight.Medium),
    Font(R.font.host_grotesk_bold, FontWeight.Bold)
)

// Fallback if fonts are missing, replace HostGrotesk with FontFamily.Default
val AppTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = HostGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        color = TextPrimary
    ),
    titleMedium = TextStyle(
        fontFamily = HostGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = TextPrimary
    ),
    bodyLarge = TextStyle(
        fontFamily = HostGrotesk,
        fontWeight = FontWeight.Medium, // Product name
        fontSize = 16.sp,
        color = TextPrimary
    ),
    bodyMedium = TextStyle(
        fontFamily = HostGrotesk,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = TextPrimary
    ),
    labelSmall = TextStyle(
        fontFamily = HostGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        color = TextAlt
    )
)
