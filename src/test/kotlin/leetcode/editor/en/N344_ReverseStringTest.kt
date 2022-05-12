package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N344_ReverseStringTest {
    private val solution = N344_ReverseString.Solution()

    @Test
    fun reverseString_inputIshello_outputIsolleh() {
        val input = charArrayOf('h', 'e', 'l', 'l', 'o')
        solution.reverseString(input)

        assertArrayEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), input)
    }

    @Test
    fun reverseString_inputIsHannah_outputIshannaH() {
        val input = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        solution.reverseString(input)

        assertArrayEquals(charArrayOf('h', 'a', 'n', 'n', 'a', 'H'), input)
    }
}