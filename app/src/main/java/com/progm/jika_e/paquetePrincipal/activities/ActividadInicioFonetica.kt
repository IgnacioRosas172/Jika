package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.progm.jika_e.R
import com.progm.jika_e.databinding.ActivityActividadInicioFoneticaBinding
import com.progm.jika_e.databinding.EjerciciosMainBinding
import com.progm.jika_e.paquetePrincipal.constantes.Constants

class ActividadInicioFonetica : AppCompatActivity() {
    private lateinit var binding: ActivityActividadInicioFoneticaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_inicio_fonetica)

        val btnIrACuestionR: Button = findViewById(R.id.btnSilaba)
        btnIrACuestionR.setOnClickListener {
            val intent = Intent(this, QuizCuestionsR::class.java)
            startActivity(intent)
        }

    }
}