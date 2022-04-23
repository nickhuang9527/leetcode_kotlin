package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N231_PowerOfTwoTest {
    private val solution = N231_PowerOfTwo.Solution()

    @Test
    fun isPowerOfTwo_inputIs1_resultIsTrue() {
        val input = 1
        val output = solution.isPowerOfTwo(input)

        assertEquals(true, output)
    }

    @Test
    fun isPowerOfTwo_inputIs16_resultIsTrue() {
        val input = 16
        val output = solution.isPowerOfTwo(input)

        assertEquals(true, output)
    }

    @Test
    fun isPowerOfTwo_inputIs3_resultIsFalse() {
        val input = 3
        val output = solution.isPowerOfTwo(input)

        assertEquals(false, output)
    }
}