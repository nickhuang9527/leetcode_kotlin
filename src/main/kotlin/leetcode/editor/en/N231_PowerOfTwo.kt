//Given an integer n, return true if it is a power of two. Otherwise, return 
//false. 
//
// An integer n is a power of two, if there exists an integer x such that n == 2
//ˣ. 
//
// 
// Example 1: 
//
// 
//Input: n = 1
//Output: true
//Explanation: 2⁰ = 1
// 
//
// Example 2: 
//
// 
//Input: n = 16
//Output: true
//Explanation: 2⁴ = 16
// 
//
// Example 3: 
//
// 
//Input: n = 3
//Output: false
// 
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
//Bit Manipulation Recursion 👍 3122 👎 288


package leetcode.editor.en

class N231_PowerOfTwo {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPowerOfTwo(n: Int): Boolean {
            /*
            思路:
            一直整除 2 直到無法整除, 如果結果為 1 代表是 2 的冪
            return when {
                n == 0 -> false
                n == 1 -> true
                else -> {
                    var num = n
                    while (num % 2 == 0) {
                        num /= 2
                        if (num == 1) break
                    }
                    return num == 1
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
             */
            if (n <= 0) return false
            return (n and n - 1) == 0
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}