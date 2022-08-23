

interface CountingMathTask {


    fun taskResult(): Int

  class Base(
      private val text: String

  ) : CountingMathTask {
      override fun taskResult(): Int {
          val numbers = text.split("*" )
      }
  }

}