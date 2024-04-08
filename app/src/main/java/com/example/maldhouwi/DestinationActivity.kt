package com.example.maldhouwi

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maldhouwi.ui.theme.MaldhouwiTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Destination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){

    Column (modifier = Modifier.fillMaxSize())
    {
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "menu", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent= Intent(Intent.ACTION_SEND)
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

        //Start of box
        Box(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.statue),
                contentDescription = "statue" ,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds)

            androidx.compose.material3.Text(
                text ="Let's plan your next vacation",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

        }
        //End of Box
        //Search bar
        Spacer(modifier = Modifier.height(40.dp))
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search ,
            onValueChange ={search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = { androidx.compose.material3.Text(text = "What's your next destination")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")})
           //End of search bar
        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(
            text = "Recently viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))

// Card then column then box
        //Start of row

        Row (modifier = Modifier.horizontalScroll(rememberScrollState()))
        {
            //Card one
            Card (
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp))
            {
                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(135.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.galaxy),
                            contentDescription = "galaxy",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "New York",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
            //End of card one
            Spacer(modifier = Modifier.width(5.dp))

            //Card two
            Card (
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp))
            {
                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(135.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.galaxy),
                            contentDescription = "galaxy",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "New York",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
            //End of card two
            Spacer(modifier = Modifier.width(5.dp))

            //Card three
            Card (
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp))
            {
                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(135.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.galaxy),
                            contentDescription = "galaxy",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "New York",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
            //End of card three
            Spacer(modifier = Modifier.width(5.dp))
            //Card four
            Card (
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp))
            {
                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(135.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.galaxy),
                            contentDescription = "galaxy",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "New York",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
            //End of card four
            Spacer(modifier = Modifier.width(5.dp))
            //Card five
            Card (
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp))
            {
                Column {
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(135.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.galaxy),
                            contentDescription = "galaxy",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "New York",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
            //End of card five
        }
        //End of row



        Spacer(modifier = Modifier.height(20.dp))
        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = { mContext.startActivity(Intent(mContext,ExploreActivity::class.java))},
                colors = ButtonDefaults.buttonColors(Color.Red),)
            {
                Text(text = "Book Your Ticket")
            }

        }

        Spacer(modifier = Modifier.height(20.dp))
        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = { mContext.startActivity(Intent(mContext,FirstScreenActivity::class.java))},
                colors = ButtonDefaults.buttonColors(Color.Red),)
            {
                Text(text = "Animation")
            }

        }










    }
}


@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()
}