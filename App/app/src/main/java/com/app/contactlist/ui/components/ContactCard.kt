package com.app.contactlist.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.app.contactlist.R
import com.app.contactlist.model.Contact
import com.app.contactlist.ui.theme.ContactListTheme
import com.app.contactlist.ui.theme.Green

@Composable
fun ContactCard(contact: Contact) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        Modifier
            .fillMaxWidth()
            .heightIn(40.dp)
            .animateContentSize()
            .clickable { expanded = !expanded },
        shape = RoundedCornerShape(20),
        elevation = 2.dp,
        border = if(expanded) BorderStroke(1.dp, Green) else BorderStroke(1.dp, Color.Transparent)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = contact.image,
                contentDescription = "Icon",
                Modifier
                    .padding(start = 28.dp, top = 8.dp, bottom = 8.dp)
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop,
                placeholder = painterResource(id = R.drawable.ic_contact),
                error = painterResource(id = R.drawable.ic_contact)
            )
            Column(Modifier.padding(start = 18.dp, top = 8.dp, bottom = 8.dp)) {
                Text(
                    text = contact.name,
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    color = Green,
                    letterSpacing = 0.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
                AnimatedVisibility(expanded) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.ic_phone),
                                contentDescription = "Phone Icon",
                                Modifier.padding(end = 18.dp)
                            )
                            Text(
                                text = contact.number,
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_light)),
                                color = Green,
                                letterSpacing = 0.sp,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 1,
                                textAlign = TextAlign.Left
                            )
                        }

                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.ic_email),
                                contentDescription = "E-mail Icon",
                                Modifier.padding(end = 18.dp)
                            )
                            Text(
                                text = contact.email,
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.poppins_light)),
                                color = Green,
                                letterSpacing = 0.sp,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = 1,
                                textAlign = TextAlign.Left
                            )
                        }
                    }
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
            ContactCard(
                Contact(
                    name = "Luke Skywalker",
                    email = "ladosombrio@email.com",
                    number = "4002 89222",
                    image = null
                )
            )
        }
    }
}