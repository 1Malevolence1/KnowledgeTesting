class RandomRegenerationOfNumbers(var min : Int, var max : Int) : RandomNumber {


    override fun randomNumber() {
        var count = 0
        var countTru = 0

        while (count < 5) {
            val numberOne = (min..max).random()
            val numberTwo = (min..max).random()

            val answer = (numberOne * numberTwo).toString()

            print("${numberOne} * ${numberTwo}  = ")

            val answerUser = readLine()

            if (answerUser == answer) {
                countTru += 1
            }
            count += 1

        }
        println("Вы решили правильно ${countTru} примера")
    }


}