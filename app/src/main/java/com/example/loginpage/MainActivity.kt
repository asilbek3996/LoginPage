package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var userNameInput:EditText
    lateinit var passwordInput:EditText
    lateinit var loginBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userNameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.btn_login)

        loginBtn.setOnClickListener {
            val username = userNameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials","User name: $username and Password: $password")
        }
    }
}