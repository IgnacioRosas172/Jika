package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.constantes.Constants
import com.progm.jika_e.databinding.ActivityResultBinding

class ResultActivityR : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent.getStringExtra(Constants.USER_NAME)
        binding.userName.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        binding.score.text = "Tu puntucación $correctAnswers es de $totalQuestions"
        binding.finishButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
