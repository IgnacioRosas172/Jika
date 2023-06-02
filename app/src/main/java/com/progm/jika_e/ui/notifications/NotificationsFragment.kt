package com.progm.jika_e.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.progm.jika_e.R
import com.progm.jika_e.databinding.FragmentNotificationsBinding
import com.progm.jika_e.paquetePrincipal.activities.*

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val cardViewSilaba = root.findViewById<CardView>(R.id.cardViewSilaba)
        cardViewSilaba.setOnClickListener {
            val intent = Intent(requireContext(), AyudaSilaba::class.java)
            startActivity(intent)
        }

        val cardViewLetraMuda = root.findViewById<CardView>(R.id.letraMuda)
        cardViewLetraMuda.setOnClickListener {
            val intent = Intent(requireContext(), AyudaLetraMuda::class.java)
            startActivity(intent)
        }

        val cardViewConsonante = root.findViewById<CardView>(R.id.Consonante)
        cardViewConsonante.setOnClickListener {
            val intent = Intent(requireContext(), AyudaConsonante::class.java)
            startActivity(intent)
        }

        val cardViewRasgos = root.findViewById<CardView>(R.id.Rasgos)
        cardViewRasgos.setOnClickListener {
            val intent = Intent(requireContext(), AyudaRasgos::class.java)
            startActivity(intent)
        }

        val cardViewArticulacion = root.findViewById<CardView>(R.id.Articulacion)
        cardViewArticulacion.setOnClickListener {
            val intent = Intent(requireContext(), AyudaArticulacion::class.java)
            startActivity(intent)
        }

        val cardViewConteo = root.findViewById<CardView>(R.id.conteo)
        cardViewConteo.setOnClickListener {
            val intent = Intent(requireContext(), AyudaConteo::class.java)
            startActivity(intent)
        }

        val cardViewNucleo = root.findViewById<CardView>(R.id.nucleo)
        cardViewNucleo.setOnClickListener {
            val intent = Intent(requireContext(), AyudaNucleo::class.java)
            startActivity(intent)
        }

        val cardViewDiptongo = root.findViewById<CardView>(R.id.diptongo)
        cardViewDiptongo.setOnClickListener {
            val intent = Intent(requireContext(), AyudaDiptongo::class.java)
            startActivity(intent)
        }

        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}