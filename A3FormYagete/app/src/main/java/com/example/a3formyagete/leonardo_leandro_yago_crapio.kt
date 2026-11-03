package com.example.a3formyagete

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class leonardo_leandro_yago_crapio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_leonardo_leandro_yago_crapio)
        val viewNombre: TextView = findViewById(R.id.ViewName)
        val viewEmail: TextView = findViewById(R.id.ViewEmail)
        val viewBiography: TextView = findViewById(R.id.ViewBiography)
        val viewImage: ImageView = findViewById(R.id.ViewImage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val infoNombre = intent.getStringExtra(nombre)
        val infoEmail = intent.getStringExtra(email)
        val infoBiography = intent.getStringExtra(biography)
        val infoUrl = intent.getStringExtra(url)

        viewNombre.text = infoNombre
        viewEmail.text = infoEmail
        viewBiography.text = infoBiography
        Glide.with(viewImage).load(infoUrl).into(viewImage)


    }
}