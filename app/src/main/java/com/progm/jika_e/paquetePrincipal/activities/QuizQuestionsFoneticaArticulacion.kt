package com.progm.jika_e.paquetePrincipal.activities

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.constantes.Constantes
import com.progm.jika_e.paquetePrincipal.constantes.Constants
import kotlin.reflect.typeOf

class QuizQuestionsFoneticaArticulacion : AppCompatActivity() {
    private var userName: String? = null

    private val questionsList: ArrayList<QuestionActividad> = Constantes.getQuestionsArticulacion()
    private var currentQuestionIndex = 0;
    private var selectedAlternativeIndex = -1;
    private var isAnswerChecked = false;
    private var totalScore = 0;
    private val alternativesIds = arrayOf(R.id.option_One, R.id.option_Two, R.id.option_Three, R.id.option_Four)

    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null
    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var btnSubmit: Button? = null
    private var tvAlternatives: ArrayList<TextView>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question_fonetica)

        userName = intent.getStringExtra(Constants.USER_NAME)

        tvQuestion = findViewById(R.id.mainQuestion)
        ivImage = findViewById(R.id.mainImage)
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.qProgress)
        btnSubmit = findViewById(R.id.submitButton)
        tvAlternatives = arrayListOf(
            findViewById(R.id.option_One),
            findViewById(R.id.option_Two),
            findViewById(R.id.option_Three),
            findViewById(R.id.option_Four),
        )



        updateQuestion()

        btnSubmit?.setOnClickListener {
            if (!isAnswerChecked) {
                val anyAnswerIsChecked = selectedAlternativeIndex != -1
                if (!anyAnswerIsChecked) {
                    Toast.makeText(this, "Por favor, selecciona una respuesta", Toast.LENGTH_SHORT).show()
                } else {
                    val currentQuestion = questionsList[currentQuestionIndex]
                    if (
                        selectedAlternativeIndex == currentQuestion.correctAnswerIndex
                    ) {
                        answerView(tvAlternatives!![selectedAlternativeIndex], R.drawable.correct_option_border_bg)
                        totalScore++
                    } else {
                        answerView(tvAlternatives!![selectedAlternativeIndex], R.drawable.wrong_option_border_bg)
                        answerView(tvAlternatives!![currentQuestion.correctAnswerIndex], R.drawable.correct_option_border_bg)
                    }

                    isAnswerChecked = true
                    btnSubmit?.text = if (currentQuestionIndex == questionsList.size - 1) "Terminar" else "Continuar"
                    selectedAlternativeIndex = -1
                }
            } else {
                if (currentQuestionIndex < questionsList.size - 1) {
                    currentQuestionIndex++
                    updateQuestion()
                } else {
                    val intent = Intent(this, ResultActivityNew::class.java)
                    intent.putExtra(Constantes.USER_NAME, userName)
                    intent.putExtra(Constantes.TOTAL_QUESTIONS, questionsList.size)
                    intent.putExtra(Constantes.SCORE, totalScore)
                    startActivity(intent)
                    finish()
                }

                isAnswerChecked = false
            }
        }

        tvAlternatives?.let {
            for (optionIndex in it.indices) {
                it[optionIndex].let {
                    it.setOnClickListener{
                        if (!isAnswerChecked) {
                            selectedAlternativeView(it as TextView, optionIndex)
                        }
                    }
                }
            }
        }
    }

    private fun updateQuestion() {
        defaultAlternativesView()

        // Render Question Text
        tvQuestion?.text = questionsList[currentQuestionIndex].questionText
        // Render Question Image
        ivImage?.setImageResource(questionsList[currentQuestionIndex].image)
        // progressBar
        progressBar?.progress = currentQuestionIndex + 1
        // Text of progress bar
        tvProgress?.text = "${currentQuestionIndex + 1}/${questionsList.size}"

        for (alternativeIndex in questionsList[currentQuestionIndex].alternatives.indices) {
            tvAlternatives!![alternativeIndex].text = questionsList[currentQuestionIndex].alternatives[alternativeIndex]
        }

        btnSubmit?.text = if (currentQuestionIndex == questionsList.size - 1) "Terminar" else "Comprobar"
    }

    private fun defaultAlternativesView() {
        for (alternativeTv in tvAlternatives!!) {
            alternativeTv.typeface = Typeface.DEFAULT
            alternativeTv.setTextColor(Color.parseColor("#7A8089"))
            alternativeTv.background = ContextCompat.getDrawable(
                this@QuizQuestionsFoneticaArticulacion,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedAlternativeView(option: TextView, index: Int) {
        defaultAlternativesView()
        selectedAlternativeIndex = index

        option.setTextColor(
            Color.parseColor("#363A43")
        )
        option.setTypeface(option.typeface, Typeface.BOLD)
        option.background = ContextCompat.getDrawable(
            this@QuizQuestionsFoneticaArticulacion,
            R.drawable.selected_option_border_bg
        )
    }

    private fun answerView(view: TextView, drawableId: Int) {
        view.background = ContextCompat.getDrawable(
            this@QuizQuestionsFoneticaArticulacion,
            drawableId
        )
        tvAlternatives!![selectedAlternativeIndex].setTextColor(
            Color.parseColor("#FFFFFF")
        )
    }
}