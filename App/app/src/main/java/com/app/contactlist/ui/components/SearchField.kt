package com.app.contactlist.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.app.contactlist.R
import com.app.contactlist.ui.theme.Black
import com.app.contactlist.ui.theme.ContactListTheme

@Composable
fun SearchField(text: String, onSearchChange: (String) -> Unit, modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = text,
        onValueChange = { onSearchChange(it) },
        modifier,
        shape = RoundedCornerShape(80),
        singleLine = true,
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search Icon") },
        label = { Text(text = "Contact", fontFamily = FontFamily(Font(R.font.poppins_light))) },
        placeholder = { Text(text = "Search Contact...", fontFamily = FontFamily(Font(R.font.poppins_light))) },
        textStyle = TextStyle(color = Black, fontFamily = FontFamily(Font(R.font.poppins_regular)), fontSize = 18.sp)
    )
}

@Preview(showBackground = true)
@Composable
fun SearchFieldPreview() {
    ContactListTheme {
        Surface {
            SearchField("", onSearchChange = {})
        }
    }
}