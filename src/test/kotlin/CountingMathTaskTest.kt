import junit.framework.TestCase.assertEquals
import org.junit.Test

class CountingMathTaskTest {

    @Test
    fun basicTest() {
        val counter = CountingMathTask.Base(
            "4 * 5"
        )
        val result = counter.taskResult()
        assertEquals(20, result)
    }

    @Test
    fun testWithSpaces() {
        val counter = CountingMathTask.Base(
            "4  * 5 "
        )
        val result = counter.taskResult()
        assertEquals(20, result)
    }

    @Test
    fun testWithoutSpaces() {
        val counter = CountingMathTask.Base(
            "4*5"
        )
        val result = counter.taskResult()
        assertEquals(20, result)
    }

    @Test
    fun negativeTest() {
        val counter = CountingMathTask.Base(
            "-4 * -3"
        )
        val result = counter.taskResult()
        assertEquals(12, result)
    }

    @Test
    fun zeroTest() {
        val counter = CountingMathTask.Base(
            "-4 * 0"
        )
        val result = counter.taskResult()
        assertEquals(0, result)
    }
}