package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N1929_ConcatenationOfArrayTest {
    private val solution = N1929_ConcatenationOfArray.Solution()

    @Test
    fun getConcatenation_intputIs121_outputIs121121() {
        val input = intArrayOf(1, 2, 1)
        val output = solution.getConcatenation(input)

        assertArrayEquals(intArrayOf(1, 2, 1, 1, 2, 1), output)
    }

    @Test
    fun getConcatenation_intputIs1321_outputIs13211321() {
        val input = intArrayOf(1, 3, 2 ,1)
        val output = solution.getConcatenation(input)

        assertArrayEquals(intArrayOf(1, 3, 2 ,1, 1, 3, 2 ,1), output)
    }
}