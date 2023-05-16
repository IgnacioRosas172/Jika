package com.progm.jika_e.paquetePrincipal.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Toast
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.constantes.Constants
import com.progm.jika_e.databinding.EjerciciosMainBinding

class MainEjercicios : AppCompatActivity() {
    private lateinit var binding: EjerciciosMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EjerciciosMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.startbutton.setOnClickListener {
            if (binding.username.text.toString().isEmpty()) {
                Toast.makeText(this, "Por faver elije un apodo!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuizQuestions::class.java)
                intent.putExtra(Constants.USER_NAME, binding.username.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}