package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N657_RobotReturnToOriginTest {

    private val solution = N657_RobotReturnToOrigin.Solution()

    @Test
    fun judgeCircle_inputUD_robotIsReturnToOrigin() {
        val input = "UD"
        val isReturnToOrigin = solution.judgeCircle(input)

        assertEquals(true, isReturnToOrigin)
    }

    @Test
    fun judgeCircle_inputLL_robotIsNotReturnToOrigin() {
        val input = "LL"
        val isReturnToOrigin = solution.judgeCircle(input)

        assertEquals(false, isReturnToOrigin)
    }
}