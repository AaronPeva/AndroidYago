package com.example.a3formyagete

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

const val nombre: String = "nombre"
const val email: String = "email"
const val biography: String = "biography"
const val url: String = "url"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val botonEnviar: Button = findViewById(R.id.buttonEnviar)
        val editTextNombre: EditText = findViewById(R.id.TextNombre)
        val editTextEmail: EditText = findViewById(R.id.TextEmailAddress)
        val editTextBiography: EditText = findViewById(R.id.TextBiography)
        val editTextUrl: EditText = findViewById(R.id.TextURL)



        botonEnviar.setOnClickListener {

            val infoNombre = editTextNombre.text.toString()
            val infoEmail = editTextEmail.text.toString()
            val infoBiography = editTextBiography.text.toString()
            val infoUrl = editTextUrl.text.toString()

            val intent = android.content.Intent(this, leonardo_leandro_yago_crapio::class.java)
            intent.putExtra(nombre, infoNombre )
            intent.putExtra(email, infoEmail )
            intent.putExtra(biography, infoBiography )
            intent.putExtra(url, infoUrl )

            startActivity(intent)
            //Glide.with(editTextEmail).load("").into(editTextEmail)
        }
    }

}