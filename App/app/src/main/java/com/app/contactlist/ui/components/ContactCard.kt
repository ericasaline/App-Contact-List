package com.app.contactlist.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.app.contactlist.R
import com.app.contactlist.ui.theme.ContactListTheme
import com.app.contactlist.ui.theme.Green

@Composable
fun ContactCard() {
    Surface(
        shape = RoundedCornerShape(80),
        elevation = 1.dp
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .heightIn(40.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                AsyncImage(
                    model = "https://cdn.pixabay.com/photo/2021/06/08/16/54/darth-vader-6321111_640.png",
                    contentDescription = "Icon",
                    Modifier
                        .padding(start = 28.dp, top = 8.dp, bottom = 8.dp)
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                    placeholder = painterResource(id = R.drawable.ic_icon_contact)
                )
                Column(Modifier.padding(start = 18.dp)) {
                    Text(
                        text = "Luke Skywalker da Silva",
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        color = Green,
                        letterSpacing = 0.sp,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1
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