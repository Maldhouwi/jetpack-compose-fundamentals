package com.example.maldhouwi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maldhouwi.ui.theme.MaldhouwiTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ScreenActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          MySplashScreen()

            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(2000)
                mContext.startActivity(Intent(mContext,ProductAssignmentActivity::class.java))
                finish()
            }


        }
    }
}

@Composable
fun MySplashScreen(){
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.frem),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize()) {
        Spacer(modifier = Modifier.height(70.dp))
        
        androidx.compose.material3.Text(
            text = "Welcome to Linux",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )

        androidx.compose.material3.Text(
            text = "Loading....",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 650.dp),
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )


    }

}
@Preview(showBackground = true)
@Composable
fun MySplashScreenPreview(){
    MySplashScreen()
}