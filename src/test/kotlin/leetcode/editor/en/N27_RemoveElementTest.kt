package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N27_RemoveElementTest {
    private val solution = N27_RemoveElement.Solution()

    @Test
    fun removeElement_inputNumsIs3223AndValIs3_outputIs2() {
        val inputNums = intArrayOf(3, 2, 2, 3)
        val inputVal = 3
        val output = solution.removeElement(inputNums, inputVal)

        assertEquals(2, output)
    }

    @Test
    fun removeElement_inputNumsIs01223042AndValIs3_outputIs5() {
        val inputNums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val inputVal = 2
        val output = solution.removeElement(inputNums, inputVal)

        assertEquals(5, output)
    }
}