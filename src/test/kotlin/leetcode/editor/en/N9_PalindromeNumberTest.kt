package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N9_PalindromeNumberTest {
    private val solution = N9_PalindromeNumber.Solution()

    @Test
    fun isPalindrome_inputIs121_outputIsTrue() {
        val input = 121
        val output = solution.isPalindrome(input)

        assertEquals(true, output)
    }

    @Test
    fun isPalindrome_inputIsNegative121_outputIsFalse() {
        val input = -121
        val output = solution.isPalindrome(input)

        assertEquals(false, output)
    }

    @Test
    fun isPalindrome_inputIs10_outputIsTrue() {
        val input = 10
        val output = solution.isPalindrome(input)

        assertEquals(false, output)
    }
}