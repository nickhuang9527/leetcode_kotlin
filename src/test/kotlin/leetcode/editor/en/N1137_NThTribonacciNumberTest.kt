package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N1137_NThTribonacciNumberTest {
    private val solution = N1137_NThTribonacciNumber.Solution()

    @Test
    fun tribonacci_inputIs4_outputIs4() {
        val input = 4
        val output = solution.tribonacci(input)

        assertEquals(4, output)
    }

    @Test
    fun tribonacci_inputIs25_outputIs1389537() {
        val input = 25
        val output = solution.tribonacci(input)

        assertEquals(1389537, output)
    }
}