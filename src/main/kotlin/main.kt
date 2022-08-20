
fun main(){

    println("Приветствую тебя, дорогой игрко!" +
            " \nПердлагаю тебе проверерить твои знания умножения.")

    println("Выбери сложность:" +
            " 1 или 2")

    val answer = readLine().toString()

    when(answer){

        "1" -> {
            val levelOne = RandomRegenerationOfNumbers()
            levelOne.randomNumber(1,10)
        }

        "2" -> {
            val levelTwo = RandomRegenerationOfNumbers()
            levelTwo.randomNumber(11,100)
        }

        else -> {
            println("Такого уровня нет. Выбириете те, что доступны")
        }


    }
}
