package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N13_RomanToIntegerTest {
    private val solution = N13_RomanToInteger.Solution()

    @Test
    fun romanToInt_inputIsIII_outputIs3() {
        val input = "III"
        val output = solution.romanToInt(input)

        assertEquals(3, output)
    }

    @Test
    fun romanToInt_inputIsLVIII_outputIs58() {
        val input = "LVIII"
        val output = solution.romanToInt(input)

        assertEquals(58, output)
    }

    @Test
    fun romanToInt_inputIsMCMXCIV_outputIs3() {
        val input = "MCMXCIV"
        val output = solution.romanToInt(input)

        assertEquals(1994, output)
    }


}