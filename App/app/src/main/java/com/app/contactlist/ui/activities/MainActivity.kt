package com.app.contactlist.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.app.contactlist.sampledata.sampleContacts
import com.app.contactlist.ui.screens.HomeScreen
import com.app.contactlist.ui.theme.ContactListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    ContactListTheme {
        Surface {
           HomeScreen(sampleContacts)
        }
    }
}