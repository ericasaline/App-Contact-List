package com.app.contactlist.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.app.contactlist.ui.theme.ContactListTheme

@Composable
fun ContactListCards() {
    LazyColumn(
        Modifier
            .padding(top = 8.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(5) {
            ContactCard()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ContactListCardsPreview() {
    ContactListTheme {
        Surface {
            ContactListCards()
        }
    }
}