package com.example.appmicael

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appmicael.databinding.ActivitySintomasBinding

class Sintomas : AppCompatActivity() {
    lateinit var binding: ActivitySintomasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySintomasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val voltarDiag = binding.retornar
        voltarDiag.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, Diagnostico::class.java)
            startActivity(intent)
            finish()
        }
    }
}