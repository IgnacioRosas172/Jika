package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
        val btnIrALetra: Button = findViewById(R.id.btnLetraMuda)
        val btnIrARasgos: Button = findViewById(R.id.btnRasgosSordos)
        val btnIrAConsonante: Button = findViewById(R.id.btnConsonante)
        val btnIrAArticulacion: Button = findViewById(R.id.btnArticulacion)
        val btnIrAConteo: Button = findViewById(R.id.btnConteo)
        val btnIrANucleo: Button = findViewById(R.id.btnNucleo)
        val btnIrADiptongos: Button = findViewById(R.id.btnDiptongo)




        btnIrACuestionR.setOnClickListener {
            val intent = Intent(this, QuizCuestionsR::class.java)
            startActivity(intent)
        }

        btnIrALetra.setOnClickListener {
            val intent = Intent(this, QuizQuestionFonetica::class.java)
            startActivity(intent)
        }

        btnIrARasgos.setOnClickListener {
            val intent = Intent(this, QuizQuestionFoneticaRasgos::class.java)
            startActivity(intent)
        }

        btnIrAConsonante.setOnClickListener {
            val intent = Intent(this, QuizQuestionsFoneticaConsonante::class.java)
            startActivity(intent)
        }

        btnIrAArticulacion.setOnClickListener {
            val intent = Intent(this, QuizQuestionsFoneticaArticulacion::class.java)
            startActivity(intent)
        }

        btnIrAConteo.setOnClickListener {
            val intent = Intent(this, QuizQuestionsFoneticaConteo::class.java)
            startActivity(intent)
        }

        btnIrANucleo.setOnClickListener {
            val intent = Intent(this, QuizQuestionsFoneticaNucleo::class.java)
            startActivity(intent)
        }

        btnIrADiptongos.setOnClickListener {
            val intent = Intent(this, QuizQuestionsFoneticaDiptongo::class.java)
            startActivity(intent)
        }

    }
}