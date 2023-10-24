class manager (val generator: generator) {

    val green = "\u001B[32m"
    val reset = "\u001b[0m"

    fun readConsole(): Boolean{
        println("Сколько предложений хочешь сгенерировать?\n" +
                "Введи число")
        val input = readln()
        return when (input){
            "/quit" -> {
                println("До новых встреч!")
                false
            }
            "/help" -> {
                greetings()
                true
            }
            else -> {
                _generateSpeech(input)
                true
            }
        }
    }

    fun greetings(){
        println("Генератор бесконечной речи приветствует тебя!\n" +
                "Этот генератор позволяет выступить на любой коференци по диджиталу!\n" +
                "Без подготовки!"
        )
    }

    fun _generateSpeech(input: String): String{
        if (validateNumber(input)){
            println(green + generator.generateSpeech(input.toInt()) + reset)
        }
        return ""
    }

}