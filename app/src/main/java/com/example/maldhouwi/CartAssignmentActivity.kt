package com.example.maldhouwi

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maldhouwi.ui.theme.Pink

class CartAssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCart()

        }
    }
}

@Composable
fun MyCart(){

    Column (
        modifier = Modifier.fillMaxSize())
    {
        val mContext = LocalContext.current

        Spacer(modifier = Modifier.height(60.dp))

        //Code for the image
        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.mellow) ,
                contentDescription = "background",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(350.dp),
                contentScale = ContentScale.Crop
            )
        }
        //End of code for the image

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text ="Add to Your Cart",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth())

        Text(
            text = "Apple technology provides many benefits to IT companies, from its high-quality hardware and friendly interface to its robust security features strong app ecosystem.",
            modifier = Modifier.padding(20.dp),
            textAlign = TextAlign.Center,
            fontSize = 15.sp)

        Spacer(modifier = Modifier.height(40.dp))

        //Beginning of button
        Button(
            onClick = { mContext.startActivity(Intent(mContext,PayAssignmentActivity::class.java)) },
            shape = RoundedCornerShape(25.dp),
            colors = ButtonDefaults.buttonColors(Pink),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Next")

        }
        //End of Button







    }



}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyCartPreview(){
    MyCart()
}