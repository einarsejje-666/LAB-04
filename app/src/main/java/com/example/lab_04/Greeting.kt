package com.example.lab_04

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
// Cambio hecho por Eyner en rama main
fun Greeting(name: String = "Student") {
    Text(
        text = "Hello, $name! 👋",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        modifier = Modifier.padding(24.dp)
    )
}