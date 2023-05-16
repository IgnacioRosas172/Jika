package com.progm.jika_e.paquetePrincipal.cards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.progm.jika_e.R

class CardFragment: Fragment() {

    private var mCardView: CardView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view: View = inflater.inflate(R.layout.card_fragment_adapter, container, false)
        mCardView = view.findViewById<View>(R.id.cardView) as CardView
        mCardView!!.setMaxCardElevation(mCardView!!.getCardElevation()
                * CardAdapter.MAX_ELEVATION_FACTOR)
        return view



    }
    fun getCardView(): CardView? {
        return mCardView
    }
}