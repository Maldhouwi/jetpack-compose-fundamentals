package com.example.maldhouwi

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column (modifier = Modifier
        .paint(
            painterResource(id = com.example.maldhouwi.R.drawable.melo),
            contentScale = ContentScale.FillBounds
        )
        .fillMaxSize())
    {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { androidx.compose.material3.Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "menu", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                 Icon(imageVector = Icons.Default.Share, contentDescription ="share", tint = Color.White )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription ="settings", tint = Color.White )
                }
            })
        //End of TopAppBar

       Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(text = "BREEDS OF DOGS",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic,
            color = Color.Black,
            fontWeight = FontWeight.Bold,)

        Spacer(modifier = Modifier.height(20.dp))
         //First row
        Row {
            Image(painter = painterResource(id = R.drawable.galaxy),
                contentDescription = "galaxy",
                modifier = Modifier.size(width = 300.dp, height = 200.dp))
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "BULL DOG", fontSize = 18.sp)
                androidx.compose.material3.Text(text = "BullDog is an amazing dog", fontSize = 18.sp)
            }
        }
        //End of first row


        Spacer(modifier = Modifier.height(20.dp))
        //Second row
        Row {
            Image(painter = painterResource(id = R.drawable.frem),
                contentDescription = "galaxy",
                modifier = Modifier.size(width = 300.dp, height = 200.dp))
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "GERMAN SHEPHERD", fontSize = 18.sp)
                androidx.compose.material3.Text(text = "BullDog is an amazing dog", fontSize = 18.sp)
            }
        }
        //End of second row


        Spacer(modifier = Modifier.height(20.dp))
        //Third row
        Row {
            Image(painter = painterResource(id = R.drawable.galaxy),
                contentDescription = "galaxy",
                modifier = Modifier.size(width = 300.dp, height = 200.dp))
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                androidx.compose.material3.Text(text = "BELGIAN MALANOISE", fontSize = 18.sp)
                androidx.compose.material3.Text(text = "BullDog is an amazing dog", fontSize = 18.sp)
            }
        }
        //End of third row


        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Spacer(modifier = Modifier.width(80.dp))
            Button(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java))},colors = ButtonDefaults.buttonColors(Color.Red),shape = RoundedCornerShape(5.dp),)
            {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
                androidx.compose.material3.Text(text = "Back")
            }
            Spacer(modifier = Modifier.width(60.dp))
            
            Button(onClick = { mContext.startActivity(Intent(mContext,intentActivity::class.java))},colors = ButtonDefaults.buttonColors(Color.Red),shape = RoundedCornerShape(5.dp),)
            {
                androidx.compose.material3.Text(text = "Next")
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "foward")
            }


        }












    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}