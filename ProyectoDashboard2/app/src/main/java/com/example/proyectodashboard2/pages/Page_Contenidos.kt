package com.example.proyectodashboard2.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.proyectodashboard2.R

@Composable
fun Page_Contenidos() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
        Text(text = "Contenidos", style = MaterialTheme.typography.h2)
        Image(painter = painterResource(id = R.drawable.contenido), contentDescription = null)
    }
}