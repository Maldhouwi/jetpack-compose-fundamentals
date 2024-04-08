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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maldhouwi.ui.theme.MaldhouwiTheme
import com.example.maldhouwi.ui.theme.Pink

class ChairActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyChair()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyChair(){

    Column (modifier = Modifier.fillMaxSize())
    {
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = {  },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext,PayAssignmentActivity::class.java)) }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "menu", tint = Color.Black)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription ="basket", tint = Color.Black )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription ="menu", tint = Color.Black )
                }
            })
        //End of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))



   //Beginning of row containing the list items
        Row(modifier = Modifier.horizontalScroll(rememberScrollState()))
        {
            androidx.compose.material3.Text(
                text = "Chairs",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(30.dp))

            androidx.compose.material3.Text(
                text = "Tables",
                fontSize = 30.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(30.dp))

            androidx.compose.material3.Text(
                text = "Sofa",
                fontSize = 30.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(30.dp))

            androidx.compose.material3.Text(
                text = "Beds",
                fontSize = 30.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(30.dp))

            androidx.compose.material3.Text(
                text = "Seats",
                fontSize = 30.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(30.dp))

            androidx.compose.material3.Text(
                text = "Stools",
                fontSize = 30.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(30.dp))

        }
        //End of row containing list items

        Spacer(modifier = Modifier.height(20.dp))


  //Beginning of main column2
        Column (
            modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState()))
        {

          //Beginning of row1
            Row {
                //Beginning of card1
                Card (modifier = Modifier
                    .height(300.dp)
                    .width(180.dp))
                {
                    //Beginning of column inside card
                    Column {
                        //Beginning of box containing image
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {

                            Image(painter = painterResource(id = R.drawable.woodenchair),
                                contentDescription ="galaxy",
                                modifier = Modifier
                                    .height(150.dp)
                                    .fillMaxWidth(),
                                contentScale = ContentScale.FillBounds)

                        }
                        //End of box containing image
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Amos Chair",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "A Chair is  very important in life",
                            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                            )
                        Spacer(modifier = Modifier.height(10.dp))



                            androidx.compose.material3.Text(
                                text = "Ksh 10000",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(start = 15.dp))



                    }
                    //End of column inside card




                }
                //End of card1
                Spacer(modifier = Modifier.width(10.dp))

                //Beginning of card2
                Card (modifier = Modifier
                    .height(300.dp)
                    .width(200.dp))
                {
                    //Beginning of column inside card
                    Column {
                        //Beginning of box containing image
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {

                            Image(painter = painterResource(id = R.drawable.fancyseat),
                                contentDescription ="galaxy",
                                modifier = Modifier
                                    .height(150.dp)
                                    .fillMaxWidth(),
                                contentScale = ContentScale.FillBounds)

                        }
                        //End of box containing image
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Kew Chair",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "A Chair is  very important in life",
                            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))



                        androidx.compose.material3.Text(
                            text = "Ksh 58000",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 15.dp))

                    }
                    //End of column inside card

                }
                //End of card2

            }
            //End of row1
            Spacer(modifier = Modifier.height(20.dp))


            //Beginning of row2
            Row {
                //Beginning of card1
                Card (modifier = Modifier
                    .height(300.dp)
                    .width(180.dp))
                {
                    //Beginning of column inside card
                    Column {
                        //Beginning of box containing image
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {

                            Image(painter = painterResource(id = R.drawable.chair),
                                contentDescription ="galaxy",
                                modifier = Modifier
                                    .height(150.dp)
                                    .fillMaxWidth(),
                                contentScale = ContentScale.FillBounds)

                        }
                        //End of box containing image
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Buro Chair",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "A Chair is  very important in life",
                            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))



                        androidx.compose.material3.Text(
                            text = "Ksh 49000",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 15.dp))



                    }
                    //End of column inside card




                }
                //End of card1
                Spacer(modifier = Modifier.width(10.dp))

                //Beginning of card2
                Card (modifier = Modifier
                    .height(300.dp)
                    .width(200.dp))
                {
                    //Beginning of column inside card
                    Column {
                        //Beginning of box containing image
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {

                            Image(painter = painterResource(id = R.drawable.programmingchair),
                                contentDescription ="galaxy",
                                modifier = Modifier
                                    .height(150.dp)
                                    .fillMaxWidth(),
                                contentScale = ContentScale.FillBounds)

                        }
                        //End of box containing image
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Tinar Chair",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "A Chair is  very important in life",
                            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))



                        androidx.compose.material3.Text(
                            text = "Ksh 28000",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 15.dp))

                    }
                    //End of column inside card

                }
                //End of card2

            }
            //End of row2
            Spacer(modifier = Modifier.height(20.dp))


            //Beginning of row3
            Row {
                //Beginning of card1
                Card (modifier = Modifier
                    .height(300.dp)
                    .width(180.dp))
                {
                    //Beginning of column inside card
                    Column {
                        //Beginning of box containing image
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {

                            Image(painter = painterResource(id = R.drawable.seat),
                                contentDescription ="galaxy",
                                modifier = Modifier
                                    .height(150.dp)
                                    .fillMaxWidth(),
                                contentScale = ContentScale.FillBounds)

                        }
                        //End of box containing image
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Kiwior Chair",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "A Chair is  very important in life",
                            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))



                        androidx.compose.material3.Text(
                            text = "Ksh 60000",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 15.dp))



                    }
                    //End of column inside card




                }
                //End of card1
                Spacer(modifier = Modifier.width(10.dp))

                //Beginning of card2
                Card (modifier = Modifier
                    .height(300.dp)
                    .width(200.dp))
                {
                    //Beginning of column inside card
                    Column {
                        //Beginning of box containing image
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center)
                        {

                            Image(painter = painterResource(id = R.drawable.sit),
                                contentDescription ="galaxy",
                                modifier = Modifier
                                    .height(150.dp)
                                    .fillMaxWidth(),
                                contentScale = ContentScale.FillBounds)

                        }
                        //End of box containing image
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Melo Chair",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "A Chair is  very important in life",
                            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))



                        androidx.compose.material3.Text(
                            text = "Ksh 98000",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 15.dp))

                    }
                    //End of column inside card

                }
                //End of card2

            }
            //End of row3



            Spacer(modifier = Modifier.height(40.dp))

            //Beginning of button
            Button(
                onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) },
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(Pink),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Text(text = "Main Screen")

            }
            //End of Button





        }
        //End of main column2

























    }

}
@Preview(showBackground = true)
@Composable
fun MyChairPreview(){
    MyChair()
}
