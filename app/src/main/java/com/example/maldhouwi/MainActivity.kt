package com.example.maldhouwi

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable
fun Text(){
Column(modifier = Modifier
    .paint(
        painterResource(id = com.example.maldhouwi.R.drawable.melo),
        contentScale = ContentScale.FillBounds
    )
    .verticalScroll(rememberScrollState())
    .fillMaxSize())

{
    val mContext = LocalContext.current

    androidx.compose.material3.Text(text = "Welcome to Android",
        fontSize = 30.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic)

    androidx.compose.material3.Text(text = "Android app development involves coding in Java, Kotlin, or other programming languages, as well as using software development kits (SDKs) and application programming interfaces (APIs) to access device features and services. Yes, coding is necessary to make apps on Android+")

    Spacer(modifier = Modifier.height(20.dp))

    androidx.compose.material3.Text(text = "Types of cars",
        fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(40.dp),
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Italic,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline)

    Spacer(modifier = Modifier.height(20.dp))

    androidx.compose.material3.Text(text = "1.Ferrari")
    androidx.compose.material3.Text(text = "2.Lamborghini")
    androidx.compose.material3.Text(text = "3.Porsche")
    androidx.compose.material3.Text(text = "4.Dodge")

    Spacer(modifier = Modifier.height(20.dp))
    Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
        Button(onClick = { mContext.startActivity(Intent(mContext,DestinationActivity::class.java))},
            colors = ButtonDefaults.buttonColors(Color.Red),)
        {
            androidx.compose.material3.Text(text = "Destination")
        }

    }
    Box(contentAlignment = Alignment.Center) {
        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
    }




    Spacer(modifier = Modifier.height(20.dp))
    androidx.compose.material3.Text(text = "Examples of fruits",
       fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(40.dp),
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.White,)

    Spacer(modifier = Modifier.height(20.dp))

    androidx.compose.material3.Text(text = "1.Watermelon")
    androidx.compose.material3.Text(text = "2.Apple")
    androidx.compose.material3.Text(text = "3.Pineapple")
    androidx.compose.material3.Text(text = "4.Mango")

    Spacer(modifier = Modifier.height(20.dp))

    Divider()
    Spacer(modifier = Modifier.height(20.dp))
    //Centering an image

    Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = R.drawable.back) ,
            contentDescription = "background",
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(100.dp),
            contentScale = ContentScale.Crop
        )
    }

    Spacer(modifier = Modifier.height(20.dp))

    Button(
        onClick = { mContext.startActivity(Intent(mContext,LayoutActivity::class.java)) },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
        ) {
        androidx.compose.material3.Text(text = "Continue")

    }


    Spacer(modifier = Modifier.height(10.dp))
    androidx.compose.material3.Text(text = "Want to adopt a dog? click here",
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .clickable { mContext.startActivity(Intent(mContext, DogActivity::class.java)) }
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )






}

}

@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()

}