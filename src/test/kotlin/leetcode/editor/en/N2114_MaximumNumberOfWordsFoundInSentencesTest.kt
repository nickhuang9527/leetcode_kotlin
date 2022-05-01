package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N2114_MaximumNumberOfWordsFoundInSentencesTest {
    private val solution = N2114_MaximumNumberOfWordsFoundInSentences.Solution()

    @Test
    fun mostWordsFound_inputIsCase1_outputIs6() {
        val input = arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")
        val output = solution.mostWordsFound(input)

        assertEquals(6, output)
    }

    @Test
    fun mostWordsFound_inputIsCase2_outputIs3() {
        val input = arrayOf("please wait", "continue to fight", "continue to win")
        val output = solution.mostWordsFound(input)

        assertEquals(3, output)
    }
}