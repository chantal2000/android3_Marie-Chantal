package com.example.loginproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var email: TextInputEditText
    lateinit var password: TextInputEditText
    lateinit var btnLogin: Button
    lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        login()
        signup()
    }

    fun castView() {
        email = findViewById(R.id.name)
        password = findViewById(R.id.trPas)
        btnLogin = findViewById(R.id.btnLogi)
        btnSignup = findViewById(R.id.btnSignup)

    }

    fun signup() {
        btnSignup.setOnClickListener {
            var intent = Intent(baseContext, signup::class.java)
            startActivity(intent)
        }
    }

    fun login() {
        btnLogin.setOnClickListener {
            if (email.text.toString().isEmpty() ||
                password.text.toString().isEmpty()
                    ) {
                email.setError("email Can't be blank")
                password.setError("password Can't be blank")
            } else {

                Toast.makeText(baseContext, "Welcome back ", Toast.LENGTH_SHORT).show()
            }


        }
    }
}




