package com.example.maldhouwi

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri

class intentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents(){
    Column (
        modifier = Modifier
            .paint(
                painterResource(id = com.example.maldhouwi.R.drawable.melo),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize())
    {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { Text(text = "Intents", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext,LayoutActivity::class.java)) }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription ="share", tint = Color.White )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription ="settings", tint = Color.White )
                }
            })
        //End of TopAppBar

        //Beginning of  outline button
        Spacer(modifier = Modifier.height(30.dp))
        //STK
        OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)

        )
        {
            androidx.compose.material3.Text(text = "M-PESA", color = Color.Black)
            
        }
        //End of outline button

        //Beginning of  outline button
        Spacer(modifier = Modifier.height(30.dp))
        //Email
        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("cliffeabudo@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Application for a job")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)

        )
        {
            androidx.compose.material3.Text(text = "EMAIL", color = Color.Black)

        }
        //End of outline button

        //Beginning of  outline button
        Spacer(modifier = Modifier.height(30.dp))
        //SMS
        OutlinedButton(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0720692610".toUri()
            smsIntent.putExtra("sms_body","Wagwan you safe innit?")
            mContext.startActivity(smsIntent)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)

        )
        {
            androidx.compose.material3.Text(text = "SMS", color = Color.Black)

        }
        //End of outline button

        //Beginning of  outline button
        Spacer(modifier = Modifier.height(30.dp))
        //Call
        OutlinedButton(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0720692610".toUri()
            mContext.startActivity(callIntent)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)

        )
        {
            androidx.compose.material3.Text(text = "CALL", color = Color.Black)

        }
        //End of outline button

        //Beginning of  outline button
        Spacer(modifier = Modifier.height(30.dp))
       //Camera
        OutlinedButton(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)

        )
        {
            androidx.compose.material3.Text(text = "CAMERA", color = Color.Black)

        }
        //End of outline button

        //Beginning of  outline button
        Spacer(modifier = Modifier.height(30.dp))
       //Share
        OutlinedButton(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "https://www.youtube.com/watch?v=r6-4F_cET_g")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)

        )
        {
            androidx.compose.material3.Text(text = "SHARE", color = Color.Black)

        }
        //End of outline button
        
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(text = "Don't have an account?Sign Up",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable {  mContext.startActivity(Intent(mContext,FormActivity::class.java)) }
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )













    }


}



@Preview(showBackground = true)
@Composable
fun MyIntentsPreview(){
MyIntents()
}