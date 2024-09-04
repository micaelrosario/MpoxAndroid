package com.example.appmicael

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appmicael.databinding.ActivityContentMpoxBinding

class ContentMpox : AppCompatActivity() {
    lateinit var binding: ActivityContentMpoxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityContentMpoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val voltarHome = binding.retornar
        voltarHome.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        val nextBtn = binding.btnProximo
        nextBtn.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, Diagnostico::class.java)
            startActivity(intent)
            finish()
        }
    }
}