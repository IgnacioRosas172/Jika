package com.progm.jika_e.paquetePrincipal.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Question(
    val id:Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswers: Int
)