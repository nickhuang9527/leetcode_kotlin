package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N509_FibonacciNumberTest {
    private val solution = N509_FibonacciNumber.Solution()

    @Test
    fun fib_inputIs2_outputIs1() {
        val input = 2
        val output = solution.fib(input)

        assertEquals(1, output)
    }

    @Test
    fun fib_inputIs3_outputIs2() {
        val input = 3
        val output = solution.fib(input)

        assertEquals(2, output)
    }

    @Test
    fun fib_inputIs4_outputIs3() {
        val input = 4
        val output = solution.fib(input)

        assertEquals(3, output)
    }
}