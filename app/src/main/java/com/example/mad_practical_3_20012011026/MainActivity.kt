package com.example.mad_practical_3_20012011026

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_practical_3_20012011026.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
    }
}