
fun main(){

    println("Приветствую тебя, дорогой игрко!" +
            " \nПердлагаю тебе проверерить твои знания умножения.")

    println("Выбери сложность:" +
            " 1 или 2")

    val answer = readLine().toString()

    when(answer){

        "1" -> {
            val levelOne = RandomRegenerationOfNumbers(min = 1, max = 10)
            levelOne.randomNumber()
        }

        "2" -> {
            val levelTwo = RandomRegenerationOfNumbers(min = 11, max = 100)
            levelTwo.randomNumber()
        }

        else -> {
            println("Такого уровня нет. Выбириете те, что доступны")
        }


    }
}
