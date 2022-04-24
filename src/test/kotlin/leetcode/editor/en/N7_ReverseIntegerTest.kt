package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N7_ReverseIntegerTest {
    private val solution = N7_ReverseInteger.Solution()

    @Test
    fun reverse_inputIs123_outputIs321() {
        val input = 123
        val output = solution.reverse(input)

        assertEquals(321, output)
    }

    @Test
    fun reverse_inputIsNegative123_outputIsNegative321() {
        val input = -123
        val output = solution.reverse(input)

        assertEquals(-321, output)
    }

    @Test
    fun reverse_inputIs120_outputIs21() {
        val input = 120
        val output = solution.reverse(input)

        assertEquals(21, output)
    }

    @Test
    fun reverse_inputIs1534236469_outputIs0() {
        val input = 1534236469
        val output = solution.reverse(input)

        assertEquals(0, output)
    }
}