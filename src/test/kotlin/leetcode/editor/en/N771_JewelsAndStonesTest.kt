package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N771_JewelsAndStonesTest {
    private val solution = N771_JewelsAndStones.Solution()

    @Test
    fun numJewelsInStones_jewelsIsaAAndStonesIsaAAbbbb_outputIs3() {
        val jewels = "aA"
        val stones = "aAAbbbb"
        val output = solution.numJewelsInStones(jewels, stones)

        assertEquals(3, output)
    }

    @Test
    fun numJewelsInStones_jewelsIszAndStonesIsZZ_outputIs0() {
        val jewels = "z"
        val stones = "ZZ"
        val output = solution.numJewelsInStones(jewels, stones)

        assertEquals(0, output)
    }
}