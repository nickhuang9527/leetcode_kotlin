package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N258_AddDigitsTest {
    private val solution = N258_AddDigits.Solution()

    @Test
    fun addDigits_inputIs38_resultIs2() {
        val input = 38
        val result = solution.addDigits(input)

        assertEquals(2, result)
    }

    @Test
    fun addDigits_inputIs0_resultIs0() {
        val input = 0
        val result = solution.addDigits(input)

        assertEquals(0, result)
    }
}