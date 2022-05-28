package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N136_SingleNumberTest {
    private val solution = N136_SingleNumber.Solution()

    @Test
    fun singleNumber_inputIs221_outputIs1() {
        val input = intArrayOf(2, 2, 1)
        val output = solution.singleNumber(input)

        assertEquals(1, output)
    }

    @Test
    fun singleNumber_inputIs41212_outputIs4() {
        val input = intArrayOf(4, 1, 2, 1, 2)
        val output = solution.singleNumber(input)

        assertEquals(4, output)
    }
}