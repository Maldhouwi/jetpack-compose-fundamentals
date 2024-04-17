package com.example.maldhouwi

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maldhouwi.ui.theme.MaldhouwiTheme
import com.example.maldhouwi.ui.theme.Pink
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

class AddEmployeeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            firebaseUI()
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun firebaseUI() {
    val context= LocalContext.current
    val employeeName = remember { mutableStateOf("") }
    val employeeIdentification = remember { mutableStateOf("") }
    val employeePost = remember { mutableStateOf("") }


    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val mContext = LocalContext.current

        Text(
            text = "Add Details",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "course",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = employeeName.value,
            onValueChange = { employeeName.value = it },
            placeholder = { Text(text = "Enter your employee name") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(
            value = employeeIdentification.value,
            onValueChange = { employeeIdentification.value = it },
            placeholder = { Text(text = "Enter your employee ID") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(
            value = employeePost.value,
            onValueChange = { employeePost.value = it },
            placeholder = { Text(text = "Enter your area of jurisdiction") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                if (TextUtils.isEmpty(employeeName.value.toString())) {
                    Toast.makeText(context, "Please enter your name", Toast.LENGTH_SHORT)
                        .show()
                } else if (TextUtils.isEmpty(employeeIdentification.value.toString())) {
                    Toast.makeText(context, "Please enter your Identification", Toast.LENGTH_SHORT)
                        .show()
                } else if (TextUtils.isEmpty(employeePost.value.toString())) {
                    Toast.makeText(
                        context,
                        "Please enter your post",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                } else {
                    addDataToFirebase(
                        employeeName.value, employeeIdentification.value, employeePost.value, context
                    )
                }
            },

            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(Pink),
            shape = RoundedCornerShape(5.dp)
        ) {

            Text(text = "Add Data", modifier = Modifier.padding(8.dp))
        }

        Spacer(modifier = Modifier.height(5.dp))


        Text(
            text = "View Employees",
            color = Pink,
            modifier = Modifier
                .clickable {
                    context.startActivity(Intent(context, EmployeeActivity::class.java))
                }
                .padding(8.dp))
    }

}



fun addDataToFirebase(employeeName: String, employeeIdentification: String, employeePost: String,
                      context: Context
) {
    val db: FirebaseFirestore = FirebaseFirestore.getInstance()
    val dbEmployees: CollectionReference = db.collection("Employees")
    val Employees = Employee(employeeName, employeeIdentification, employeePost)
    dbEmployees.add(Employees).addOnSuccessListener {
        Toast.makeText(context, "Your Name has been added to Firebase Firestore", Toast.LENGTH_SHORT).show()

    }.addOnFailureListener { e ->
        Toast.makeText(context, "Fail to add details", Toast.LENGTH_SHORT).show()
    }

}



@Preview(showBackground = true)
@Composable
fun FirebaseUiPreview() {
    firebaseUI()
}
