package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N1_TwoSumTest {
    private val solution = N1_TwoSum.Solution()

    @Test
    fun N1_TwoSumTest_inputIs2_7_11_15_and_targetIs9_thenOutputIs0_1() {
        val input = intArrayOf(2, 7, 11, 15)
        val target = 9
        val output = solution.twoSum(input, target)

        assertArrayEquals(intArrayOf(0, 1), output)
    }

    @Test
    fun N1_TwoSumTest_inputIs3_2_4_and_targetIs6_thenOutputIs1_2() {
        val input = intArrayOf(3, 2, 4)
        val target = 6
        val output = solution.twoSum(input, target)

        assertArrayEquals(intArrayOf(1, 2), output)
    }

    @Test
    fun N1_TwoSumTest_inputIs3_3_and_targetIs6_thenOutputIs0_1() {
        val input = intArrayOf(3, 3)
        val target = 6
        val output = solution.twoSum(input, target)

        assertArrayEquals(intArrayOf(0, 1), output)
    }
}