package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N26_RemoveDuplicatesFromSortedArrayTest {
    private val solution = N26_RemoveDuplicatesFromSortedArray.Solution()

    @Test
    fun removeDuplicates_inputIs1_1_2_outputIs2() {
        val input = intArrayOf(1, 1, 2)
        val output = solution.removeDuplicates(input)
        
        assertEquals(2, output)
    }

    @Test
    fun removeDuplicates_inputIs0_0_1_1_1_2_2_3_3_4_outputIs5() {
        val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val output = solution.removeDuplicates(input)

        assertEquals(5, output)
    }
}