package com.example.appmicael

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appmicael.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    lateinit var binding:  ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Configuração do View Binding
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val img = binding.mpox
        img.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, ContentMpox::class.java)
            startActivity(intent)
            finish()
        }


    }
}