package com.progm.jika_e.paquetePrincipal.constantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.activities.Question
import com.progm.jika_e.paquetePrincipal.activities.QuestionSilaba

object Constants{
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS: String="correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val question1 = Question(
            1,"¿Cuál letra es la faltante?",
            R.drawable.cuento,
            "C","Q",
            "X","K",1)
        questionsList.add(question1)

        val question2 = Question(
            2, "¿Cómo se escribe la acción?",
            R.drawable.cantar,
            "Kantar", "Cantar",
            "Qantar", "Santar", 2
        )

        questionsList.add(question2)

        // 3
        val question3 = Question(
            3, "¿Cuál letra es la faltante?",
            R.drawable.cubo,
            "Q", "D",
            "L", "C", 4
        )

        questionsList.add(question3)
        // 4
        val que4 = Question(
            4, "¿Cuál es el nombre del objeto?",
            R.drawable.casa,
            "Kasa", "Tasa",
            "Zorro", "Casa", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "¿Cuál letra es la faltante?",
            R.drawable.caballo,
            "K", "Q",
            "C", "S", 3
        )

        questionsList.add(que5)
        return questionsList
    }

    fun getQuestionsSilaba(): ArrayList<QuestionSilaba>{
        val questionsList=ArrayList<QuestionSilaba>()
        val question1Silaba = QuestionSilaba(
            1,"¿Cuál es la primera sílaba?",
            R.drawable.saludo_sonido,
            "Sa","Ca",
            "Da","Ba",1)
        questionsList.add(question1Silaba)

        val question2Silaba = QuestionSilaba(
            2, "¿Cuál es la segunda sílaba?",
            R.drawable.trabajo,
            "ga", "ba",
            "Tra", "jo", 2
        )
        questionsList.add(question2Silaba)

        // 3
        val question3Silaba = QuestionSilaba(
            3, "¿Cuál es la primera silaba?",
            R.drawable.botella,
            "ma", "te",
            "lla", "bo", 4
        )
        questionsList.add(question3Silaba)

        // 4
        val que4Silaba = QuestionSilaba(
            4, "¿Cuál es la tercera silaba?",
            R.drawable.examen,
            "xa", "ex",
            "exa", "men", 4
        )
        questionsList.add(que4Silaba)

        // 5
        val que5Silaba = QuestionSilaba(
            5, "¿Cuál es la segunda silaba?",
            R.drawable.aprender,
            "ap", "apre",
            "pren", "der", 3
        )
        questionsList.add(que5Silaba)

        return questionsList
    }
    }

