class RandomRegenerationOfNumbers : RandomNumber {


    override fun randomNumber(min: Int, max: Int) {
        val numberOne = (min..max).random()
        val numberTwo = (min..max).random()
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