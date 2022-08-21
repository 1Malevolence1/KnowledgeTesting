class GeneratingRandomExample(min: Int, max: Int) : RandomRegenerationOfNumbers(min, max), RandomNumber {

    override fun randomNumber() {
          val numberOne = (min..max).random()
          val numberTwo = (min..max).random()
          println("${numberOne} * ${numberTwo} =")
    }
}