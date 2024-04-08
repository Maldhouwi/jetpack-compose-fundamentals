package com.example.maldhouwi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maldhouwi.ui.theme.MaldhouwiTheme

class DogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dog()

        }
    }
}

@Composable
fun Dog(){

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()))
    {
        Spacer(modifier = Modifier.height(30.dp))



          Box {
              Image(
                  painter = painterResource(id = R.drawable.dogprint) ,
                  contentDescription = "dog",
                  modifier = Modifier.padding(start = 90.dp))
              //Beginning of woof text
              androidx.compose.material3.Text(
                  text = "Woof",
                  textAlign = TextAlign.Center,
                  modifier = Modifier.fillMaxWidth().padding(end = 15.dp),
                  fontWeight = FontWeight.Bold,
                  fontSize = 45.sp)
              // End of woof text
          }



        Spacer(modifier = Modifier.height(20.dp))


        //Beginning of card one
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Koda",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "2 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card one





        //Beginning of card two
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Lola",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "16 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card two



        //Beginning of card three
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Frankie",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "2 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card three





        //Beginning of card four
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Nox",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "8 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card four






        //Beginning of card five
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Faye",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "8 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card five






        //Beginning of card six
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Bella",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "14 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card six




        //Beginning of card seven
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Moana",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "2 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card seven




        //Beginning of card eight
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Tzeitzel",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "7 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card eight






        //Beginning of card nine
        Card (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(80.dp)
            .fillMaxWidth())
        {

            //Beginning of row stuff 1
            Row {

                //Beginning of box containing image
                Box (modifier = Modifier.fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.back) ,
                        contentDescription = "background",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 7.dp)
                            .clip(shape = CircleShape)
                            .size(60.dp),
                        contentScale = ContentScale.Crop
                    )
                    //Beginning of column containing the text  of dog name
                    Column {
                        androidx.compose.material3.Text(
                            text = "Melo",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier.padding(start = 100.dp, top = 10.dp))

                        androidx.compose.material3.Text(
                            text = "2 Years old",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 100.dp))
                    }
                    //End of text containing the dog name
                }
                //End of box containing image
            }
            //End of row stuff 1
        }
        Spacer(modifier = Modifier.height(10.dp))
        //End of card nine




















    }

}
@Preview(showBackground = true)
@Composable
fun DogPreview(){
    Dog()
}