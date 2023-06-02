package com.progm.jika_e.paquetePrincipal.activities

data class QuestionActividad(
    val id: Int,
    val questionText: String,
    val image: Int,
    val alternatives: ArrayList<String>,
    val correctAnswerIndex: Int,
)
