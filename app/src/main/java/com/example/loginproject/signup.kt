package com.example.loginproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
class signup : AppCompatActivity() {
    lateinit var name: TextInputEditText
    lateinit var gender: Spinner
    lateinit var email: TextInputEditText
    lateinit var phone: TextInputEditText
    lateinit var password: TextInputEditText
    lateinit var signup: Button
    lateinit var Back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castView()
        btnSignup()
        back()
    }

    fun castView() {
        name = findViewById(R.id.name1)

//        var allGenders=gender.selectedItem.toString()
        email = findViewById(R.id.etEmail)
        phone = findViewById(R.id.etPhone)
        password = findViewById(R.id.etPassword)
        signup = findViewById(R.id.btnBAck)
        Back = findViewById(R.id.tbnBack)
        gender = findViewById(R.id.spGender)
        var allGenders = arrayOf("Male", "Female", "Binary")
        var genderAdapter =ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, allGenders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        gender.adapter= genderAdapter
    }
    fun btnSignup() {
        if (name.text.toString().isEmpty() || email.text.toString().isEmpty() ||
            password.text.toString().isEmpty() ||
            phone.text.toString().isEmpty()
        ) {
            name.setError("Please fill it; the name Can't be blank")
            email.setError("email Can't be blank")
            password.setError("password Can't be blank")
            phone.setError("phone number can't be Empty")
        } else {
            Toast.makeText(baseContext, "Hello, You are Welcome ", Toast.LENGTH_SHORT).show()
        }
    }

    fun back() {
        Back.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
