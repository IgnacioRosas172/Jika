package com.progm.jika_e.paquetePrincipal.constantes

import com.progm.jika_e.R
import com.progm.jika_e.paquetePrincipal.activities.QuestionActividad
import com.progm.jika_e.paquetePrincipal.activities.QuestionSilaba

object Constantes {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()

        // 1
        val questionOne = QuestionActividad(
            1,
            "¿Cuál letra es la faltante?",
            R.drawable.cuento,
            arrayListOf("C","Q","X","K"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "¿Cómo se escribe la acción?",
            R.drawable.cantar,
            arrayListOf("Kantar", "Cantar","Qantar", "Santar"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "¿Cuál letra es la faltante?",
            R.drawable.cubo,
            arrayListOf("Q", "D",
                "L", "C"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "¿Cuál es el nombre del objeto?",
            R.drawable.casa,
            arrayListOf("Kasa", "Tasa",
                "Zorro", "Casa"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "¿Cuál letra es la faltante?",
            R.drawable.caballo,
            arrayListOf("K", "Q",
                "C", "S"),
            2
        )
        questionsList.add(questionFive)


        return questionsList
    }

    fun getQuestionsSilaba(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()

        // 1
        val questionOne = QuestionActividad(
            1,
            "¿Cuál es la primera sílaba?",
            R.drawable.saludo_sonido,
            arrayListOf("Sa","Ca",
                "Da","Ba"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "¿Cuál es la segunda sílaba?",
             R.drawable.trabajo,
            arrayListOf("ga", "ba",
                "Tra", "jo"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "¿Cuál es la primera sílaba?",
            R.drawable.botella,
            arrayListOf("ma", "te",
                "lla", "bo"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "¿Cuál es la tercera sílaba?",
            R.drawable.examen,
            arrayListOf("xa", "ex",
                "exa", "men"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "¿Cuál es la segunda sílaba?",
            R.drawable.aprender,
            arrayListOf("ap", "apre",
                "pren", "der"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }

    fun getQuestionsLetraMuda(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()
        val questionOne = QuestionActividad(
            1,
            "Indentifica las palabras con una letra muda",
            R.drawable.lupa,
            arrayListOf("Hablante","Zorro",
                "Dalmata","Burro"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "Indentifica las palabras con una letra muda?",
            R.drawable.identificas,
            arrayListOf("Celular", "Zanahoria",
                "Teclado", "Zapato"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "Indentifica las palabras con una letra muda",
            R.drawable.buscarl,
            arrayListOf("Malla", "Eroe",
                "Leña", "Heroe"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "Indentifica las palabras con una letra muda",
            R.drawable.busacardos,
            arrayListOf("Habilidad", "Bocado",
                "Funda", "Negro"),
            0
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "Indentifica las palabras con una letra muda",
            R.drawable.examen,
            arrayListOf("Disco", "Gitana",
                "Hazaña", "Azaña"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }

    fun getQuestionsRasgos(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()
        val questionOne = QuestionActividad(
            1,
            "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.gris,
            arrayListOf("Nasalidad", "Sonoridad",
                "Vibrante", "Vibraciones"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.gk,
            arrayListOf("Nasalidad", "Sonoridad",
                "Vibrante", "Vibraciones"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.rr,
            arrayListOf("Sonoridad", "Velar v. alveolar",
                "Sasalidad", "# de vibraciones"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.pb,
            arrayListOf("Vibraciones", "Sonido",
                "Nasalidad", "Sonoridad"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "¿En qué consiste la diferencia entre los dos sonidos?",
            R.drawable.td,
            arrayListOf("Vibraciones", "# de vibraciones",
                "Sonoridad", "Nasalidad"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }

    fun getQuestionsConsonante(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()
        val questionOne = QuestionActividad(
            1,
            "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.aprender,
            arrayListOf("Traer","La",
                "Volver","Amo"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.saludo_sonido,
            arrayListOf("Gato", "Que",
                "Loco", "Amigo"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.cerebroo,
            arrayListOf("Ruta", "Boca",
                "Llano", "Teclado"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.mental,
            arrayListOf("Garrafon", "Iniciar",
                "Dado", "Sordo"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "Identica la palabra que comienza con una consonante sorda (sin vibración de las cuerdas vocales)",
            R.drawable.smental,
            arrayListOf("Arco", "Vaca",
                "Pensar", "Bote"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }

    fun getQuestionsArticulacion(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()
        val questionOne = QuestionActividad(
            1,
            "Selecciona la manera de articulación",
            R.drawable.combo,
            arrayListOf("Vibrante","Oclusivas",
                "Laterales","Nasal"),
            1,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "Selecciona la manera de articulación",
            R.drawable.lobo,
            arrayListOf("Aproximante", "Fricada",
                "Vibrante múltiple", "Vibrante simple"),
            0
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "Selecciona la manera de articulación",
            R.drawable.leche,
            arrayListOf("Modificada", "Nasal",
                "Llana", "Africada"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "Selecciona la manera de articulación",
            R.drawable.perro,
            arrayListOf("Nasal", "Oclusiva",
                "simple", "Vibrante Múltiple"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "Selecciona la manera de articulación",
            R.drawable.pera,
            arrayListOf("Nasal", "Africada",
                "Vibrante simple", "Ninguna"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }

    fun getQuestionsConteo(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()
        val questionOne = QuestionActividad(
            1,
            "¿Cuántas sílabas tiene?",
            R.drawable.pensar,
            arrayListOf("2","4",
                "3","6"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.buscarl,
            arrayListOf("Cinco", "Dos",
                "Tres", "Una"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.caminar,
            arrayListOf("1", "5",
                "4", "3"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.escribir,
            arrayListOf("Cinco", "Dos",
                "Seis", "Tres"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "¿Cuántas sílabas tiene la acción de la imagen?",
            R.drawable.cantar,
            arrayListOf("1", "4",
                "2", "3"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }

    fun getQuestionsNucleo(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()
        val questionOne = QuestionActividad(
            1,
            "¿Cuál es el núcleo sílabico?",
            R.drawable.alumnos,
            arrayListOf("A","lum",
                "no","nos"),
            1,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "¿Cuál es el núcleo sílabico?",
            R.drawable.hueso,
            arrayListOf("eso", "Hue",
                "ue", "so"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "¿Cuál es el núcleo sílabico?",
            R.drawable.perrol,
            arrayListOf("Pe", "ro",
                "erro", "rro"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "¿Cuál es una estructura del núcleo sílabico?",
            R.drawable.nucleo,
            arrayListOf("C + V", "Z+S",
                "BB", "Llano"),
            0
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "¿Cuál es una estructura del núcleo sílabico?",
            R.drawable.aprender,
            arrayListOf("Ninguna", "R+RR",
                "C+V+C", "Marca"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }

    fun getQuestionsDiptongo(): ArrayList<QuestionActividad> {
        val questionsList = ArrayList<QuestionActividad>()
        val questionOne = QuestionActividad(
            1,
            "¿Cuál palabra es un diptongo?",
            R.drawable.ciudad,
            arrayListOf("Ciudad","Carro",
                "Dalmata","Barco"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = QuestionActividad(
            2,
            "¿Cuál es un ejemplo de diptongo?",
            R.drawable.tiempo,
            arrayListOf("ga", "ie",
                "Tra", "jo"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = QuestionActividad(
            3,
            "¿Cuál palabra es un diptongo?",
            R.drawable.baile,
            arrayListOf("Mayas", "Terreno",
                "Llanta", "Baile"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = QuestionActividad(
            4,
            "¿Cuál es un tipo de diptongo?",
            R.drawable.examen,
            arrayListOf("Homogéneo", "Exacto",
                "Serie", "Teminal"),
            0
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = QuestionActividad(
            5,
            "¿Cuál es un tipo de diptongo?",
            R.drawable.aprender,
            arrayListOf("Aplicado", "Aprensivo",
                "Creciente", "Derecho"),
            2
        )
        questionsList.add(questionFive)
        return questionsList
    }
}