package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N28_ImplementStrStrTest {
    private val solution = N28_ImplementStrStr.Solution()

    @Test
    fun strStr_haystackIshelloAndneedleIsll_outputIs2() {
        val haystack = "hello"
        val needle = "ll"
        val output = solution.strStr(haystack, needle)

        assertEquals(2, output)
    }

    @Test
    fun strStr_haystackIsaaaaaAndneedleIsbba_outputIsNegative1() {
        val haystack = "aaaaa"
        val needle = "bba"
        val output = solution.strStr(haystack, needle)

        assertEquals(-1, output)
    }

    @Test
    fun strStr_needleIsEmpty_outputIs0() {
        val haystack = "hello"
        val needle = ""
        val output = solution.strStr(haystack, needle)

        assertEquals(0, output)
    }

    @Test
    fun strStr_haystackIsmississippiAndneedleIsissipi_outputIsNegative1() {
        val haystack = "mississippi"
        val needle = "issipi"
        val output = solution.strStr(haystack, needle)

        assertEquals(-1, output)
    }
}