package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N58_LengthOfLastWordTest {
    private val solution = N58_LengthOfLastWord.Solution()

    @Test
    fun lengthOfLastWord_inputIs_Hello_World_outputIs5() {
        val input = "Hello World"
        val output = solution.lengthOfLastWord(input)

        assertEquals(5, output)
    }

    @Test
    fun lengthOfLastWord_inputIs_fly_me_to_the_moon_outputIs4() {
        val input = "fly me to the moon"
        val output = solution.lengthOfLastWord(input)

        assertEquals(4, output)
    }

    @Test
    fun lengthOfLastWord_inputIs_luffy_is_still_joyboy_outputIs6() {
        val input = "luffy is still joyboy"
        val output = solution.lengthOfLastWord(input)

        assertEquals(6, output)
    }
}