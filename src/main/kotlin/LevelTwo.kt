
class LevelTwo: RandomNumber {
    override fun randomNumber() {
        val numberOne = (11..100).random()
        val numberTwo = (0..100).random()
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