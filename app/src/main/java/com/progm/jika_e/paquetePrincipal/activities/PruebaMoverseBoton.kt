package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.cards.MainCard

class PruebaMoverseBoton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_moverse_boton)

        val btn: Button = findViewById(R.id.buttonOrtografia)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, MainCard:: class.java)
            startActivity(intent)

        }

    }
}