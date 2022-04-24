package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N342_PowerOfFourTest {
    private val solution = N342_PowerOfFour.Solution()

    @Test
    fun isPowerOfFour_inputIs16_resultIsTrue() {
        val input = 16
        val output = solution.isPowerOfFour(input)

        assertEquals(true, output)
    }

    @Test
    fun isPowerOfFour_inputIs5_resultIsFalse() {
        val input = 6
        val output = solution.isPowerOfFour(input)

        assertEquals(false, output)
    }

    @Test
    fun isPowerOfFour_inputIs1_resultIsTrue() {
        val input = 1
        val output = solution.isPowerOfFour(input)

        assertEquals(true, output)
    }
}