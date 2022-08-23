class GeneratingRandomExampleText(private val min: Int, private val max: Int) : RandomNumberText {

    override fun randomNumberText() : String {
        val numberOne = (min..max).random()
        val numberTwo = (min..max).random()
        return "$numberOne * $numberTwo"
    }

}