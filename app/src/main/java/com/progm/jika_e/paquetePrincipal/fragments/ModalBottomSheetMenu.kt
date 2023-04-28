package com.progm.jika_e.paquetePrincipal.fragments

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.firebase.firestore.ktx.toObject
import com.progm.jika_e.paquetePrincipal.activities.*

import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.models.Client
import com.progm.jika_e.paquetePrincipal.providers.AuthProvider
import com.progm.jika_e.paquetePrincipal.providers.ClientProvider

class ModalBottomSheetMenu: BottomSheetDialogFragment() {

    val clientProvider = ClientProvider()
    val authProvider = AuthProvider()

    var textViewUsername: TextView? = null
    var linearLayoutLogout: LinearLayout? = null
    var linearLayoutProfile: LinearLayout? = null
    var linearLayoutHistory: LinearLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_iniciomenu, container, false) //es del archivo xml modal_bottom_sheet_menu

 //esto es de los atributos del xml
            //    linearLayoutLogout = view.findViewById(R.id.linearLayoutLogout)
        //linearLayoutProfile = view.findViewById(R.id.linearLayoutProfile)


        getClient()

        linearLayoutLogout?.setOnClickListener { goToMain() }
        linearLayoutProfile?.setOnClickListener { goToProfile() }

        return view
    }

    private fun goToProfile() {
        val i = Intent(activity, ProfileActivity::class.java)
        startActivity(i)
    }



    private fun goToMain() {
        authProvider.logout()
        val i = Intent(activity, MainActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(i)
    }

    private fun getClient() {
        clientProvider.getClientById(authProvider.getId()).addOnSuccessListener { document ->
            if (document.exists()) {
                val client = document.toObject(Client::class.java)
                textViewUsername?.text = "${client?.name} ${client?.lastname}"
            }
        }
    }

    companion object {
        const val TAG = "ModalBottomSheetMenu"
    }


}