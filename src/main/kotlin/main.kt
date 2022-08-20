
fun main(){

    println("Приветствую тебя, дорогой игрко!" +
            " \nПердлагаю тебе проверерить твои знания умножения.")

    println("Выбери сложность:" +
            " 1 или 2")

    val answer = readLine().toString()

    when(answer){

        "1" -> {
            val levelOne = LevelOne()
            levelOne.randomNumber()
        }

        "2" -> {
            val levelTwo = LevelTwo()
            levelTwo.randomNumber()
        }

        else -> {
            println("Такого уровня нет. Выбириете те, что доступны")
        }


    }
}
