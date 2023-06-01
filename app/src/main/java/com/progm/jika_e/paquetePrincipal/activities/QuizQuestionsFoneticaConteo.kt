package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.airbnb.lottie.LottieAnimationView
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.constantes.Constants
import com.progm.jika_e.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsFoneticaConteo : AppCompatActivity(), View.OnClickListener {

    private lateinit var animationView: LottieAnimationView

    private var myCurrentPos: Int = 1
    private var myQuestionsList: ArrayList<QuestionFonetica>? = null
    private var mySelectedPos: Int = 0
    private var myCorrectAns: Int = 0
    private var myUsername: String? = null

    private lateinit var binding:ActivityQuizQuestionsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        myUsername = intent.getStringExtra(Constants.USER_NAME)

        myQuestionsList = Constants.getQuestionsConteo()

        setQuestion()

        binding.optionOne.setOnClickListener(this)
        binding.optionTwo.setOnClickListener(this)
        binding.optionThree.setOnClickListener(this)
        binding.optionFour.setOnClickListener(this)
        binding.submitButton.setOnClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    private fun setQuestion() {
        val question = myQuestionsList!![myCurrentPos - 1]



        defaultOptionsView()

        if (myCurrentPos == myQuestionsList!!.size) {
            binding.submitButton.text = "Termminar"
        } else {
            binding.submitButton.text = "Comprobar"
        }

        binding.progressBar.progress = myCurrentPos
        binding.qProgress.text = "$myCurrentPos/${binding.progressBar.max}"

        binding.mainQuestion.text = question!!.question
        binding.mainImage.setImageResource(question.image)
        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        binding.optionFour.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = arrayListOf<TextView>(
            binding.optionOne,
            binding.optionTwo,
            binding.optionThree,
            binding.optionFour
        )

        for (option in options) {
            option.setTextColor(Color.parseColor("#363A43"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(tv: TextView, selectedNum: Int) {
        defaultOptionsView()
        mySelectedPos = selectedNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.default_option_border_bg
        )
    }

    private fun answerView(answer: Int, drawView: Int) {
        when (answer) {
            1 -> {
                binding.optionOne.background = ContextCompat.getDrawable(
                    this, drawView
                )
            }
            2 -> {
                binding.optionTwo.background = ContextCompat.getDrawable(
                    this, drawView
                )
            }
            3 -> {
                binding.optionThree.background = ContextCompat.getDrawable(
                    this, drawView
                )
            }
            4 -> {
                binding.optionFour.background = ContextCompat.getDrawable(
                    this, drawView
                )
            }
        }
    }

    override fun onClick(v:View?) {
        when (v?.id) {
            R.id.option_One -> {
                selectedOptionView(binding.optionOne, 1)
            }
            R.id.option_Two -> {
                selectedOptionView(binding.optionTwo, 2)
            }
            R.id.option_Three -> {
                selectedOptionView(binding.optionThree, 3)
            }
            R.id.option_Four -> {
                selectedOptionView(binding.optionFour, 4)
            }
            R.id.submitButton -> {
                if (mySelectedPos == 0) {
                    myCurrentPos++

                    when {
                        myCurrentPos <= myQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, myUsername)
                            intent.putExtra(Constants.CORRECT_ANSWERS, myCorrectAns)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, myQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = myQuestionsList?.get(myCurrentPos - 1)
                    if (question!!.correctAnswers != mySelectedPos) {
                        answerView(mySelectedPos, R.drawable.incorrect_option_border_bg)
                    } else {
                        myCorrectAns++
                    }
                    answerView(question.correctAnswers, R.drawable.correct_option_border_bg)

                    if (myCurrentPos == myQuestionsList!!.size) {
                        binding.submitButton.text = "Terminar"
                    } else {
                        binding.submitButton.text = "Ir a la siguiente pregunta"
                    }
                    mySelectedPos = 0
                }
            }
        }
    }
}

