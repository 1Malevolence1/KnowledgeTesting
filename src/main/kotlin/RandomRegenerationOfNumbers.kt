class RandomRegenerationOfNumbers : RandomNumber {
    override fun randomNumber() {
        val numberOne = (0..10).random()
        val numberTwo = (0..10).random()
        val answer = (numberOne * numberTwo).toString()

        print("${numberOne} * ${numberTwo}  = ")
        val answerUser = readLine()

        if (answerUser == answer)
            println("Верно")
        else {
            println("Не верно")
        }

    }
}