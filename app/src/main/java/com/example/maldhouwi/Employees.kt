package com.example.maldhouwi
import com.google.firebase.firestore.Exclude

data class Employees(
    @Exclude var employeeID: String? = "",
    var employeeName: String? = "",
    var employeeIdentification: String? = "",
    var employeePost: String? = ""
)


