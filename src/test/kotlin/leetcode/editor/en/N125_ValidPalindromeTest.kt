package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N125_ValidPalindromeTest {
    private val solution = N125_ValidPalindrome.Solution()

    @Test
    fun isPalindrome_inputIsPalindrome_outputIsTrue() {
        val input = "A man, a plan, a canal: Panama"
        val output = solution.isPalindrome(input)

        assertEquals(true, output)
    }

    @Test
    fun isPalindrome_inputIsNotPalindrome_outputIsFalse() {
        val input = "race a car"
        val output = solution.isPalindrome(input)

        assertEquals(false, output)
    }

    @Test
    fun isPalindrome_inputIsBlankString_outputIsTrue() {
        val input = " "
        val output = solution.isPalindrome(input)

        assertEquals(true, output)
    }

    @Test
    fun isPalindrome_inputIs0P_outputIsFalse() {
        val input = "0P"
        val output = solution.isPalindrome(input)

        assertEquals(false, output)
    }

    @Test
    fun isPalindrome_inputIsab2a_outputIsFalse() {
        val input = "ab2a"
        val output = solution.isPalindrome(input)

        assertEquals(false, output)
    }
}