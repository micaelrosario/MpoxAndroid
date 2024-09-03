package com.example.appmicael

import android.content.Intent  // Adicione esta importação
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appmicael.databinding.ActivityIntroBinding

class Intro : AppCompatActivity() {
    lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Configuração do View Binding
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = binding.btnIntro
        button.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }

    }
}
