package com.example.appmicael

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContentMpox : AppCompatActivity() {
    lateinit var binding: ActivityDiagnosticoBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Configuração do View Binding
        binding = ActivityDiagnosticoBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = binding.
        button.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, Diagnostico::class.java)
            startActivity(intent)
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}