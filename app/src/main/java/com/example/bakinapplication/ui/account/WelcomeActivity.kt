package com.example.bakinapplication.ui.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bakinapplication.R
import com.example.bakinapplication.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    lateinit var binding : ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)

        binding.welcomeLogInButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.welcomeSignUpButton.setOnClickListener {
            startActivity(Intent(this, SignUpActivity1::class.java))
        }
    }


}