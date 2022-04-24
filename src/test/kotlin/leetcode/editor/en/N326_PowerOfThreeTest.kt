package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N326_PowerOfThreeTest {
    private val solution = N326_PowerOfThree.Solution()

    @Test
    fun isPowerOfThree_inputIs27_resultIsTrue() {
        val input = 27
        val output = solution.isPowerOfThree(input)

        assertEquals(true, output)
    }

    @Test
    fun isPowerOfThree_inputIs0_resultIsFalse() {
        val input = 0
        val output = solution.isPowerOfThree(input)

        assertEquals(false, output)
    }

    @Test
    fun isPowerOfThree_inputIs9_resultIsTrue() {
        val input = 9
        val output = solution.isPowerOfThree(input)

        assertEquals(true, output)
    }

    @Test
    fun isPowerOfThree_inputIs1594323_resultIsTrue() {
        val input = 1594323
        val output = solution.isPowerOfThree(input)

        assertEquals(true, output)
    }
}