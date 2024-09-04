package com.example.appmicael

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.appmicael.databinding.ActivityDiagnosticoBinding

class Diagnostico : AppCompatActivity() {
    lateinit var binding: ActivityDiagnosticoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityDiagnosticoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val voltarMpox = binding.retornar
        voltarMpox.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, ContentMpox::class.java)
            startActivity(intent)
            finish()
        }

        binding.buttonVideo.setOnClickListener {
            openVideo()
        }

        val nextBtn = binding.btnProximo
        nextBtn.setOnClickListener {
            // Cria uma intenção para iniciar a HomeActivity
            val intent = Intent(this, Sintomas::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun openVideo() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=55yjbu86uIc"))
        startActivity(intent)
    }
}
