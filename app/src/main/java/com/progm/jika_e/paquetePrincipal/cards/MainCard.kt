package com.progm.jika_e.paquetePrincipal.cards

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.progm.jika_e.R

import com.progm.jika_e.databinding.CardAdapterBinding

import com.progm.jika_e.iniciomenu
import com.progm.jika_e.paquetePrincipal.activities.MainEjercicios

class MainCard : AppCompatActivity() {

    private lateinit var binding: CardAdapterBinding


    private var mButton: Button? = null
    private var mViewPager: ViewPager? = null
    private var mCardAdapter: CardPagerAdapter? = null
    private var mCardShadowTransformer: ShadowTransformer? = null
    private var mFragmentCardAdapter: CardFragmentPagerAdapter? = null
    private var mFragmentCardShadowTransformer: ShadowTransformer? = null
    private var mShowingFragments = false

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CardAdapterBinding.inflate(layoutInflater)
        setContentView(R.layout.card_ortografia)

        mViewPager = findViewById<View>(R.id.viewPager) as? ViewPager


//        val backButton: ImageButton = findViewById(R.id.imageViewBack)

        mButton = findViewById<View>(R.id.btnComenzar) as? Button



        mCardAdapter = CardPagerAdapter()
        mCardAdapter!!.addCardItem(CardItem(R.string.title_1, R.string.text_1))
        mCardAdapter!!.addCardItem(CardItem(R.string.title_2, R.string.text_2))
        mCardAdapter!!.addCardItem(CardItem(R.string.title_3, R.string.text_3))
        mCardAdapter!!.addCardItem(CardItem(R.string.title_4, R.string.text_4))
        mFragmentCardAdapter = CardFragmentPagerAdapter(supportFragmentManager,
            dpToPixels(2, this))

        if (mViewPager != null && mCardAdapter != null) {
            mCardShadowTransformer = ShadowTransformer(mViewPager!!, mCardAdapter!!)
            mFragmentCardShadowTransformer = ShadowTransformer(mViewPager!!, mFragmentCardAdapter!!)
        }

        mViewPager!!.adapter = mCardAdapter
        mViewPager!!.setPageTransformer(false, mCardShadowTransformer)
        mViewPager!!.offscreenPageLimit = 3

        //backButton.setOnClickListener {
        //      onBackPressed()
        //   }

    }




    fun dpToPixels(dp: Int, context: Context): Float {
        return dp * context.resources.displayMetrics.density
    }

    companion object {
        const val TAG = "MainCard"
    }
}