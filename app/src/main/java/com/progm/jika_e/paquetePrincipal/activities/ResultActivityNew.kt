package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.progm.jika_e.R
import com.progm.jika_e.databinding.ActivityProfileBinding
import com.progm.jika_e.paquetePrincipal.constantes.Constantes
import com.progm.jika_e.paquetePrincipal.models.Client
import com.progm.jika_e.paquetePrincipal.providers.AuthProvider
import com.progm.jika_e.paquetePrincipal.providers.ClientProvider

class ResultActivityNew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        lateinit var binding: ActivityProfileBinding
        val driverProvider = ClientProvider()
        val authProvider = AuthProvider()

        val userName = intent.getStringExtra(Constantes.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constantes.TOTAL_QUESTIONS, 0)
        val score = intent.getIntExtra(Constantes.SCORE, 0)

        val congratulationsTv: TextView = findViewById(R.id.congratulations)
        val scoreTv: TextView = findViewById(R.id.score)
        val btnRestart: Button = findViewById(R.id.finishButton)

        congratulationsTv.text = "¡Felicidades!"
        scoreTv.text = "Tu puntucación $score de $totalQuestions"
        btnRestart.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        fun getUser() {
            driverProvider.getClientById(authProvider.getId()).addOnSuccessListener { document ->
                if (document.exists()) {
                    val client = document.toObject(Client::class.java)
                    binding.textFieldName.setText(client?.name)
                }
            }
        }

    }
}