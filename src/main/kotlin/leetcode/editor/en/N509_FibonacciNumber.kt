//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the 
//Fibonacci sequence, such that each number is the sum of the two preceding ones, 
//starting from 0 and 1. That is, 
//
// 
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
// 
//
// Given n, calculate F(n). 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
// 
//
// Example 3: 
//
// 
//Input: n = 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 30 
// 
// Related Topics Math Dynamic Programming Recursion Memoization π 3391 π 263


package leetcode.editor.en

class N509_FibonacciNumber {

    /*
    ζθ·―:
        1γ 1γ 2γ 3γ 5γ 8γ 13γ 21γ 34γ 55γ 89γ 144γ 233γ 377γ 610γ 987 ...
        F(0) = 0
        F(1) = 1
        F(n) = F(n - 1) + F(n - 2)

        1. δ½Ώη¨ιθΏ΄

        0 return 0
        1 return 1
        else -> return F(n - 1) + F(n - 2)

        2. callstack ε€, ιεΊ¦ζ’, η¨θΏ΄εζΉειεΊ¦
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun fib(n: Int): Int {
            /*
            return when (n) {
                0, 1 -> n
                else -> fib(n - 1) + fib(n - 2)
            }
             */
            if (n <= 0) return 0
            if (n == 1) return 1

            var prevPrevNum = 0
            var prevNum = 1
            var current = 0

            (2..n).forEach {
                current = prevPrevNum + prevNum
                prevPrevNum = prevNum
                prevNum = current
            }
            return current
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}