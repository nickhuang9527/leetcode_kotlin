package leetcode.editor.en

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class N1108_DefangingAnIPAddressTest {
    private val solution = N1108_DefangingAnIPAddress.Solution()

    @Test
    fun defangIPaddr_inputIs_1_1_1_1() {
        val input = "1.1.1.1"
        val output = solution.defangIPaddr(input)

        assertEquals("1[.]1[.]1[.]1", output)
    }

    @Test
    fun defangIPaddr_inputIs_255_100_50_0() {
        val input = "255.100.50.0"
        val output = solution.defangIPaddr(input)

        assertEquals("255[.]100[.]50[.]0", output)
    }
}