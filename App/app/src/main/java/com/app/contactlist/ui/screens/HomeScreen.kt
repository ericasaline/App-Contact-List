package com.app.contactlist.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.app.contactlist.ui.components.SearchField
import com.app.contactlist.ui.theme.ContactListTheme

@Composable
fun HomeScreen() {
    Column {
        var text by remember { mutableStateOf("") }
        SearchField(
            text = text,
            onSearchChange = {text = it},
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    ContactListTheme {
        Surface {
            HomeScreen()
        }
    }
}