package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N1528_ShuffleStringTest {
    private val solution = N1528_ShuffleString.Solution()

    @Test
    fun restoreString_inputSIscodeleetAndInputIndicesIs45670213_outputIsleetcode() {
        val s = "codeleet"
        val indices = intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)
        val output = solution.restoreString(s, indices)

        assertEquals("leetcode", output)
    }

    @Test
    fun restoreString_inputSIsabcAndInputIndicesIs012_outputIsabc() {
        val s = "abc"
        val indices = intArrayOf(0, 1, 2)
        val output = solution.restoreString(s, indices)

        assertEquals("abc", output)
    }
}