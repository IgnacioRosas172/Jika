package com.progm.jika_e.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.oAuthCredential
import com.progm.jika_e.databinding.ActivityProfileBinding
import com.progm.jika_e.databinding.FragmentDashboardBinding
import com.progm.jika_e.paquetePrincipal.models.Client
import com.progm.jika_e.paquetePrincipal.providers.AuthProvider
import com.progm.jika_e.paquetePrincipal.providers.ClientProvider


class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    val clientProvider = ClientProvider()
    val authProvider = AuthProvider()
    val auth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.btnUpdate
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        getClient()
     //   binding.imageViewBack.setOnClickListener { finish() }
       binding.btnUpdate.setOnClickListener { logout() }

        return root
    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun getClient() {
        clientProvider.getClientById(authProvider.getId()).addOnSuccessListener { document ->
            if (document.exists()) {
                val client = document.toObject(Client::class.java)
                binding.textViewEmail.text = client?.email
                binding.textFieldName.setText(client?.name)
                binding.textFieldLastname.setText(client?.lastname)
                binding.textFieldPhone.setText(client?.phone)

            }
        }
    }

    fun logout() {

        auth.signOut()
    }


}