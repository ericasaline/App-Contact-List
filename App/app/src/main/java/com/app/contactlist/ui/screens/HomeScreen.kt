package com.app.contactlist.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.contactlist.R
import com.app.contactlist.model.Contact
import com.app.contactlist.sampledata.sampleContacts
import com.app.contactlist.ui.components.ContactCard
import com.app.contactlist.ui.components.SearchField
import com.app.contactlist.ui.theme.ContactListTheme
import com.app.contactlist.ui.theme.Green

@Composable
fun HomeScreen(contacts: List<Contact>) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier)

        Text(
            text = "My Contacts",
            Modifier.fillMaxWidth(),
            fontSize = 22.sp,
            fontFamily = FontFamily(Font(R.font.poppins_bold)),
            color = Green,
            textAlign = TextAlign.Center,
            letterSpacing = 0.sp
        )

        var text by remember { mutableStateOf("") }
        SearchField(
            text = text,
            onSearchChange = {text = it},
            Modifier.fillMaxWidth()
        )

        val searchContact = remember(text) {
            if(text.isNotBlank()) {
                sampleContacts.filter { contact ->
                    contact.name.contains(text, ignoreCase = true)
                }
            } else {
                emptyList()
            }
        }

        LazyColumn(
            Modifier
                .padding(top = 8.dp, bottom = 12.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            if(text.isBlank()) {
                items(contacts) { c ->
                    ContactCard(contact = c)
                }
            } else {
                items(searchContact) { c ->
                    ContactCard(contact = c)
                }
            }
        }

        Spacer(modifier = Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    ContactListTheme {
        Surface {
            HomeScreen(sampleContacts)
        }
    }
}