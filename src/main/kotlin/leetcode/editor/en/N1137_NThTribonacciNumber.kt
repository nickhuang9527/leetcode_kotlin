//The Tribonacci sequence Tn is defined as follows: 
//
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0. 
//
// Given n, return the value of Tn. 
//
// 
// Example 1: 
//
// 
//Input: n = 4
//Output: 4
//Explanation:
//T_3 = 0 + 1 + 1 = 2
//T_4 = 1 + 1 + 2 = 4
// 
//
// Example 2: 
//
// 
//Input: n = 25
//Output: 1389537
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 37 
// The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 -
// 1. 
// Related Topics Math Dynamic Programming Memoization 👍 1768 👎 104


package leetcode.editor.en

class N1137_NThTribonacciNumber {

    /*
    思路:
        0、 1、 1、 2、 4、 7、 13...
        F(0) = 0
        F(1) = 1
        F(2) = 1
        F(n) = F(n - 1) + F(n - 2) + F(n - 3)

        1. 使用遞迴

        0 return 0
        1 return 1
        else -> return F(n - 1) + F(n - 2) + F(n - 3)

        2. callstack 多, 速度慢, 用迴圈改善速度
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun tribonacci(n: Int): Int {

            /*
            return when (n) {
                0 -> 0
                1, 2 -> 1
                else -> tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1)
            }
             */

            if (n <= 0) return 0
            if (n <= 2) return 1

            var prevPrevPrevNum = 0
            var prevPrevNum = 1
            var prevNum = 1
            var current = 0

            (3..n).forEach {
                current = prevNum + prevPrevNum + prevPrevPrevNum
                prevPrevPrevNum = prevPrevNum
                prevPrevNum = prevNum
                prevNum = current
            }
            return current
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}