package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    MainLogo()
                }
            }
        }
    }
}

@Composable
private fun MainLogo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.windows_logo)
        Spacer(
            modifier = Modifier.padding(bottom=150.dp)
        )
        Image(
            painter = image,
            contentDescription = null,
            Modifier.fillMaxWidth(0.3f)
        )
        Spacer(
                modifier = Modifier.padding(bottom=20.dp)
        )
        Text(
            text = stringResource(R.string.name),
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            color = Color.Black
        )
        Spacer(
            modifier = Modifier.padding(bottom=10.dp)
        )
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Spacer(
            modifier = Modifier.padding(bottom=100.dp)
        )
        Divider(
            modifier = Modifier.fillMaxWidth())
        ContactRow(
            text = stringResource(id = R.string.contact),
            icon = Icons.Rounded.Phone
        )
        Divider(modifier = Modifier.fillMaxWidth())
        ContactRow(
            text = stringResource(id = R.string.email),
            icon = Icons.Rounded.Email
            )
        Divider(modifier = Modifier.fillMaxWidth())
        ContactRow(
            text = stringResource(id = R.string.github),
            icon = Icons.Rounded.Share
        )
    }
}

@Composable
fun ContactRow(
    text: String,
    icon: ImageVector
) {
    Row(
        horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text, color = Color.Black, modifier = Modifier
                .weight(3f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        MainLogo()
    }
}