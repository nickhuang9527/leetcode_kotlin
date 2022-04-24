//Given an integer n, return true if it is a power of four. Otherwise, return 
//false. 
//
// An integer n is a power of four, if there exists an integer x such that n == 
//4ˣ. 
//
// 
// Example 1: 
// Input: n = 16
//Output: true
// Example 2: 
// Input: n = 5
//Output: false
// Example 3: 
// Input: n = 1
//Output: true
// 
// 
// Constraints: 
//
// 
// -2³¹ <= n <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you solve it without loops/recursion? Related Topics Math 
//Bit Manipulation Recursion 👍 1457 👎 285


package leetcode.editor.en

import kotlin.math.log2

class N342_PowerOfFour {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPowerOfFour(n: Int): Boolean {
            /*
            思路:
            一直整除 4 直到無法整除, 如果結果為 1 代表是 4 的冪

            return when (n) {
                0 -> false
                1 -> true
                else -> {
                    var num = n
                    while (num % 4 == 0) {
                        num /= 4
                        if (num == 1) break
                    }
                    num == 1
                }
            }
             */
            /*
            Follow up: Could you solve it without loops/recursion?
            Related Topics
            * Math
            * Bit Manipulation
            * Recursion

            不能用 loops/recursion
            思路:
            與 231 PowerOfTwo 解法一樣, 但需多加一個條件, 位數必須是奇數
            4^0 = 1 = 1 bit, 4^1 = 4 = 3 bit, 4^2 = 16 = 5 bit ...
            轉成二進制 10000... 如果是2的冪, 最高位元一定是1其他為0
            減 1 的話則除之前最高位元會變 0 其餘會變為 1,
            e.g.
            1000 - 1 = 0111
            利用此特性將每個位元做 AND 邏輯運算 (有0就0)
             1000
            &0111
            -----
             0000
            AND 完如果是 0 , 就證明數字是 2 的冪
            証明完 2 的冪後, 觀察會發現如果是 4 的冪, 最高位元會是奇數的位數
             */
            if (n <= 0) return false
            val numOfDigits = log2(n.toDouble()).toInt() + 1
            return (n and n - 1) == 0 && numOfDigits % 2 == 1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}