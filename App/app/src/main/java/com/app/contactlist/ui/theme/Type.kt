package com.app.contactlist.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.app.contactlist.R

val fonts = FontFamily(
    Font(R.font.poppins_light, weight = FontWeight.Light),
    Font(R.font.poppins_regular, weight = FontWeight.Normal),
    Font(R.font.poppins_bold, weight = FontWeight.Bold)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light
    ),
    h2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal
    ),
    h3 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold
    )
)