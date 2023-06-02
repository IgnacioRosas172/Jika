package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.constantes.Constants

class QuizActividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicios_main)

        val etName = findViewById<EditText>(R.id.username)
        val btnStart = findViewById<Button>(R.id.startbutton)

        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please, enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivityNew::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
//                finish()
            }
        }
    }
}