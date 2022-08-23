

interface CountingMathTask {
    fun taskResult(): Int

  class Base(
      private val text: String

  ) : CountingMathTask {
      override fun taskResult(): Int {
          val numbers = text.replace(" ","").split("*")
          return numbers[0].toInt() * numbers[1].toInt()
      }
  }
}