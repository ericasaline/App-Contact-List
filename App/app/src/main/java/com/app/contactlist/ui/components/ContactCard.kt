package com.app.contactlist.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.app.contactlist.R
import com.app.contactlist.ui.theme.ContactListTheme
import com.app.contactlist.ui.theme.Gray
import com.app.contactlist.ui.theme.Green
import com.app.contactlist.ui.theme.White

@Composable
fun ContactCard() {
    Surface(
        shape = RoundedCornerShape(80),
        border = BorderStroke(color = Green, width = 2.dp),
        elevation = 5.dp
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .heightIn(70.dp)
                .background(brush = Brush.horizontalGradient(colors = listOf(Gray, White)))
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                AsyncImage(
                    model = "", 
                    contentDescription = null,
                    Modifier
                        .padding(start = 28.dp, top = 22.dp, bottom = 22.dp)
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                    placeholder = painterResource(id = R.drawable.ic_icon_contact)
                )
                Column(Modifier.padding(16.dp)) {
                    Text(
                        text = "Luke",
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        color = White,
                        letterSpacing = 0.sp
                    )
                    Text(
                        text = "3465874365",
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        color = White,
                        letterSpacing = 0.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactCardPreview() {
    ContactListTheme {
        Surface {
            ContactCard()
        }
    }
}