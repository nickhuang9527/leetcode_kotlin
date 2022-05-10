package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N70_ClimbingStairsTest {
    private val solution = N70_ClimbingStairs.Solution()

    @Test
    fun climbStairs_inputIs2_outputIs2() {
        val input = 2
        val output = solution.climbStairs(input)

        assertEquals(2, output)
    }

    @Test
    fun climbStairs_inputIs3_outputIs3() {
        val input = 3
        val output = solution.climbStairs(input)

        assertEquals(3, output)
    }

    @Test
    fun climbStairs_inputIs1_outputIs1() {
        val input = 1
        val output = solution.climbStairs(input)

        assertEquals(1, output)
    }
}