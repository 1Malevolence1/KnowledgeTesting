data class MatchTask(
    private val textTask: String,
    private val rightAnswer: Int

) {
    fun <T> map(mapper: Mapper<T>) = mapper.map(
        textTask,
        rightAnswer
    )

    interface Mapper<T> {
        fun map(
            textTask: String,
            rightAnswer: Int
        ) : T
    }
}
