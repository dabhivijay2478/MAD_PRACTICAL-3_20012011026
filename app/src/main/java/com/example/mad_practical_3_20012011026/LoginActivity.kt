package com.example.mad_practical_3_20012011026

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.mad_practical_3_20012011026.databinding.ActivityLoginBinding



class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}