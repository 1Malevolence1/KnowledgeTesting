fun main() {
    println(
        "Приветствую тебя, дорогой игрко!" +
                " \nПердлагаю тебе проверерить твои знания умножения."
    )
    println(
        "Выбери сложность:" +
                " 1 или 2"
    )
    val answer = readLine().toString()
    val taskGenerator = when (answer) {
        "1" -> GeneratingRandomExampleText(min = 1, max = 10)

        "2" -> GeneratingRandomExampleText(min = 11, max = 100)

        else -> {
            println("Такого уровня нет. Выбириете те, что доступны")
            throw Exception()
        }
    }
    var rightCount = 0


    for (count in 0..9) {
        val task = taskGenerator.randomNumberText()
        println(task)
        val rightAnswer = CountingMathTask.Base(task).taskResult().toString()
        val userAnswer = readLine()

        if (userAnswer == rightAnswer){
            rightCount +=1
            println("Верно")
        }

        else
            println("Неверно")


    }
    println("Верно решено $rightCount примера")

}
