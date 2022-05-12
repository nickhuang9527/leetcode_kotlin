package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N121_BestTimeToBuyAndSellStockTest {
    private val solution = N121_BestTimeToBuyAndSellStock.Solution()

    @Test
    fun maxProfit_inputIs715364_outputIs5() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)
        val output = solution.maxProfit(input)

        assertEquals(5, output)
    }

    @Test
    fun maxProfit_inputIs76431_outputIs0() {
        val input = intArrayOf(7, 6, 4, 3, 1)
        val output = solution.maxProfit(input)

        assertEquals(0, output)
    }

    @Test
    fun maxProfit_inputIs21201_outputIs1() {
        val input = intArrayOf(2, 1, 2, 0, 1)
        val output = solution.maxProfit(input)

        assertEquals(1, output)
    }
}