package com.example.appmicael

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appmicael.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Configuração do View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Handler para atrasar a mudança de atividade
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Intro::class.java)
            startActivity(intent)
            finish()
        }, 3500)
    }
}
