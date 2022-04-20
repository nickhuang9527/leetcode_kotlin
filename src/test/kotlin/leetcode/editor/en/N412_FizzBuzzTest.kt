package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N412_FizzBuzzTest {
    private val solution = N412_FizzBuzz.Solution()

    @Test
    fun fizzBuzz_inputIs3() {
        val input = 3
        val output = solution.fizzBuzz(input)

        assertTrue(output == listOf("1", "2", "Fizz"))
    }

    @Test
    fun fizzBuzz_inputIs5() {
        val input = 5
        val output = solution.fizzBuzz(input)

        assertTrue(output == listOf("1", "2", "Fizz", "4", "Buzz"))
    }

    @Test
    fun fizzBuzz_inputIs15() {
        val input = 15
        val output = solution.fizzBuzz(input)

        assertTrue(
            output == listOf(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
            )
        )
    }
}