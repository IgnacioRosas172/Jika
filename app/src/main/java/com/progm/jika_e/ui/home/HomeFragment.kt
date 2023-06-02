package com.progm.jika_e.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.progm.jika_e.R
import com.progm.jika_e.databinding.FragmentHomeBinding
import com.progm.jika_e.paquetePrincipal.activities.ActividadInicioFonetica
import com.progm.jika_e.paquetePrincipal.cards.MainCard



class HomeFragment : Fragment() {
    var textView: TextView? = null
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    var linearLayoutProfile: LinearLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        //linearLayoutProfile = view?.findViewById(R.id.linearLayoutProfile)
       // linearLayoutProfile = root.findViewById(R.id.linearLayoutProfile)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btn: Button = root.findViewById(R.id.buttonOrtografia)
        btn.setOnClickListener {
            val intent: Intent = Intent(context, MainCard::class.java)
            startActivity(intent)
        }

        val btnFone: Button = root.findViewById(R.id.button2)
        btnFone.setOnClickListener {
            val intent: Intent = Intent(context, ActividadInicioFonetica::class.java)
            startActivity(intent)
        }



        return root
    }


  //  private fun goToProfile() {
    //    val i = Intent(activity, MainCard::class.java)
      //  startActivity(i)
    //}



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }





}
