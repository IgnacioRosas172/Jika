package com.progm.jika_e.paquetePrincipal.activities

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

import com.google.protobuf.Empty
import com.progm.jika_e.databinding.ActivityProfileBinding
import com.progm.jika_e.paquetePrincipal.models.Client
import com.progm.jika_e.paquetePrincipal.providers.AuthProvider
import com.progm.jika_e.paquetePrincipal.providers.ClientProvider
import java.io.File

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    val clientProvider = ClientProvider()
    val authProvider = AuthProvider()

    private var imageFile: File? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)




    }









    }


