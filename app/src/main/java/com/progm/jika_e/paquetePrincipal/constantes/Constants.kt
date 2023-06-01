package com.progm.jika_e.paquetePrincipal.constantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.activities.Question
import com.progm.jika_e.paquetePrincipal.activities.QuestionFonetica
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
            3, "¿Cuál es la primera sílaba?",
            R.drawable.botella,
            "ma", "te",
            "lla", "bo", 4
        )
        questionsList.add(question3Silaba)

        // 4
        val que4Silaba = QuestionSilaba(
            4, "¿Cuál es la tercera sílaba?",
            R.drawable.examen,
            "xa", "ex",
            "exa", "men", 4
        )
        questionsList.add(que4Silaba)

        // 5
        val que5Silaba = QuestionSilaba(
            5, "¿Cuál es la segunda sílaba?",
            R.drawable.aprender,
            "ap", "apre",
            "pren", "der", 3
        )
        questionsList.add(que5Silaba)

        return questionsList
    }

    fun getQuestionsLetraMuda(): ArrayList<QuestionFonetica>{
        val questionsList=ArrayList<QuestionFonetica>()
        val question1LetraMuda = QuestionFonetica(
            1,"Indentifica las palabras con una letra muda",
            R.drawable.lupa,
            "Hablante","Zorro",
            "Dalmata","Burro",1)
        questionsList.add(question1LetraMuda)

        val question2LetraMuda = QuestionFonetica(
            2, "Indentifica las palabras con una letra muda?",
            R.drawable.identificas,
            "Celular", "Zanahoria",
            "Teclado", "Zapato", 2
        )
        questionsList.add(question2LetraMuda)

        // 3
        val question3LetraMuda = QuestionFonetica(
            3, "Indentifica las palabras con una letra muda?",
            R.drawable.buscarl,
            "Malla", "Eroe",
            "Leña", "Heroe", 4
        )
        questionsList.add(question3LetraMuda)

        // 4
        val question4LetraMuda = QuestionFonetica(
            4, "¿Cuál es la tercera sílaba?",
            R.drawable.busacardos,
            "Habilidad", "Bocado",
            "Funda", "Negro", 1
        )
        questionsList.add(question4LetraMuda)

        // 5
        val question5LetraMuda = QuestionFonetica(
            5, "Indentifica las palabras con una letra muda",
            R.drawable.examen,
            "Disco", "Gitana",
            "Hazaña", "Azaña", 3
        )
        questionsList.add(question5LetraMuda)

        return questionsList
    }
    fun getQuestionsRasgos(): ArrayList<QuestionFonetica>{
        val questionsList=ArrayList<QuestionFonetica>()
        val question1Rasgos = QuestionFonetica(
            1,"¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.gris,
            "Nasalidad", "Sonoridad",
            "Vibrante", "Vibraciones", 1)
        questionsList.add(question1Rasgos)

        val question2Rasgos = QuestionFonetica(
            2, "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.gk,
            "Nasalidad", "Sonoridad",
            "Vibrante", "Vibraciones", 2)
        questionsList.add(question2Rasgos)

        // 3
        val question3Rasgos = QuestionFonetica(
            3, "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.rr,
            "Sonoridad", "Velar v. alveolar",
            "Sasalidad", "# de vibraciones", 4
        )
        questionsList.add(question3Rasgos)

        // 4
        val question4Rasgos = QuestionFonetica(
            4, "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.pb,
            "Vibraciones", "Sonido",
            "Nasalidad", "Sonoridad", 4
        )
        questionsList.add(question4Rasgos)

        // 5
        val question5Rasgos = QuestionFonetica(
            5, "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.td,
            "Vibraciones", "# de vibraciones",
            "Sonoridad", "Nasalidad", 3
        )
        questionsList.add(question5Rasgos)

        return questionsList
    }
    fun getQuestionsConsonante(): ArrayList<QuestionFonetica>{
        val questionsList=ArrayList<QuestionFonetica>()
        val question1Consonante = QuestionFonetica(
            1,"Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.aprender,
            "Traer","La",
            "Volver","Amo",1)
        questionsList.add(question1Consonante)

        val question2Consonante = QuestionFonetica(
            2, "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.saludo_sonido,
            "Gato", "Que",
            "Loco", "Amigo", 2
        )
        questionsList.add(question2Consonante)

        // 3
        val question3Consonante = QuestionFonetica(
            3, "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.cerebroo,
            "Ruta", "Boca",
            "Llano", "Teclado", 4
        )
        questionsList.add(question3Consonante)

        // 4
        val question4Consonante = QuestionFonetica(
            4, "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.mental,
            "Garrafon", "Iniciar",
            "Dado", "Sordo", 4
        )
        questionsList.add(question4Consonante)

        // 5
        val question5Consonante = QuestionFonetica(
            5, "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.smental,
            "Arco", "Vaca",
            "Pensar", "Bote", 3
        )
        questionsList.add(question5Consonante)

        return questionsList
    }
    fun getQuestionsArticulacion(): ArrayList<QuestionFonetica>{
        val questionsList=ArrayList<QuestionFonetica>()
        val question1Articulacion = QuestionFonetica(
            1,"Selecciona la manera de articulación",
            R.drawable.combo,
            "Vibrante","Oclusivas",
            "Laterales","Nasal",2)
        questionsList.add(question1Articulacion)

        val question2Articulacion = QuestionFonetica(
            2, "Selecciona la manera de articulación",
            R.drawable.lobo,
            "Aproximante", "Fricada",
            "Vibrante múltiple", "Vibrante simple", 1
        )
        questionsList.add(question2Articulacion)

        // 3
        val question3Articulacion = QuestionFonetica(
            3, "Selecciona la manera de articulación",
            R.drawable.leche,
            "Modificada", "Nasal",
            "Llana", "Africada", 4
        )
        questionsList.add(question3Articulacion)

        // 4
        val question4Articulacion = QuestionFonetica(
            4, "Selecciona la manera de articulación",
            R.drawable.perro,
            "Nasal", "Oclusiva",
            "simple", "Vibrante Múltiple", 4
        )
        questionsList.add(question4Articulacion)

        // 5
        val question5Articulacion = QuestionFonetica(
            5, "Selecciona la manera de articulación",
            R.drawable.pera,
            "Nasal", "Africada",
            "Vibrante simple", "Ninguna", 3
        )
        questionsList.add(question5Articulacion)

        return questionsList
    }
    fun getQuestionsConteo(): ArrayList<QuestionFonetica>{ //conteo de silabas
        val questionsList=ArrayList<QuestionFonetica>()
        val question1Conteo = QuestionFonetica(
            1,"¿Cuántas sílabas tiene?",
            R.drawable.pensar,
            "2","4",
            "3","6",1)
        questionsList.add(question1Conteo)

        val question2Conteo = QuestionFonetica(
            2, "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.buscarl,
            "Cinco", "Dos",
            "Tres", "Una", 2
        )
        questionsList.add(question2Conteo)

        // 3
        val question3Conteo = QuestionFonetica(
            3, "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.caminar,
            "1", "5",
            "4", "3", 4
        )
        questionsList.add(question3Conteo)

        // 4
        val question4Conteo = QuestionFonetica(
            4, "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.escribir,
            "Cinco", "Dos",
            "Seis", "Tres", 4
        )
        questionsList.add(question4Conteo)

        // 5
        val question5Conteo = QuestionFonetica(
            5, "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.cantar,
            "1", "4",
            "2", "3", 3
        )
        questionsList.add(question5Conteo)

        return questionsList
    }
    fun getQuestionsNucleo(): ArrayList<QuestionFonetica>{
        val questionsList=ArrayList<QuestionFonetica>()
        val question1Nucleo = QuestionFonetica(
            1,"¿Cuál es el núcleo sílabico?",
            R.drawable.alumnos,
            "A","lum",
            "no","nos",2)
        questionsList.add(question1Nucleo)

        val question2Nucleo = QuestionFonetica(
            2, "¿Cuál es el núcleo sílabico?",
            R.drawable.hueso,
            "eso", "Hue",
            "ue", "so", 2
        )
        questionsList.add(question2Nucleo)

        // 3
        val question3Nucleo = QuestionFonetica(
            3, "¿Cuál es el núcleo sílabico?",
            R.drawable.perrol,
            "Pe", "ro",
            "erro", "rro", 4
        )
        questionsList.add(question3Nucleo)

        // 4
        val question4Nucleo = QuestionFonetica(
            4, "¿Cuál es una estructura del núcleo sílabico?",
            R.drawable.nucleo,
            "C + V", "Z+S",
            "BB", "Llano", 1
        )
        questionsList.add(question4Nucleo)

        // 5
        val question5Nucleo = QuestionFonetica(
            5, "¿Cuál es una estructura del núcleo sílabico?",
            R.drawable.aprender,
            "Ninguna", "R+RR",
            "C+V+C", "Marca", 3
        )
        questionsList.add(question5Nucleo)

        return questionsList
    }
    fun getQuestionsDiptongo(): ArrayList<QuestionFonetica>{
        val questionsList=ArrayList<QuestionFonetica>()
        val question1Diptongo = QuestionFonetica(
            1,"¿Cuál palabra es un diptongo?",
            R.drawable.ciudad,//ciudad
            "Ciudad","Carro",
            "Dalmata","Barco",1)
        questionsList.add(question1Diptongo)

        val question2Diptongo = QuestionFonetica(
            2, "¿Cuál es un ejemplo de diptongo?",
            R.drawable.tiempo, //tiempo
            "ga", "ie",
            "Tra", "jo", 2
        )
        questionsList.add(question2Diptongo)

        // 3
        val question3Diptongo = QuestionFonetica(
            3, "¿Cuál palabra es un diptongo?",
            R.drawable.baile,
            "Mayas", "Terreno",
            "Llanta", "Baile", 4
        )
        questionsList.add(question3Diptongo)

        // 4
        val question4Diptongo = QuestionFonetica(
            4, "¿Cuál es un tipo de diptongo?",
            R.drawable.examen,
            "Homogéneo", "Exacto",
            "Serie", "Teminal", 1
        )
        questionsList.add(question4Diptongo)

        // 5
        val question5Diptongo = QuestionFonetica(
            5, "¿Cuál es un tipo de diptongo?",
            R.drawable.aprender,
            "Aplicado", "Aprensivo",
            "Creciente", "Derecho", 3
        )
        questionsList.add(question5Diptongo)

        return questionsList
    }



    }

