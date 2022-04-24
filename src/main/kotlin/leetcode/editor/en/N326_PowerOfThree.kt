//Given an integer n, return true if it is a power of three. Otherwise, return 
//false. 
//
// An integer n is a power of three, if there exists an integer x such that n ==
// 3ˣ. 
//
// 
// Example 1: 
//
// 
//Input: n = 27
//Output: true
// 
//
// Example 2: 
//
// 
//Input: n = 0
//Output: false
// 
//
// Example 3: 
//
// 
//Input: n = 9
//Output: true
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
//Recursion 👍 916 👎 118


package leetcode.editor.en

import kotlin.math.log10

class N326_PowerOfThree {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPowerOfThree(n: Int): Boolean {
            /*
            思路:
            一直整除 3 直到無法整除, 如果結果為 1 代表是 3 的冪

            return when {
                n == 0 -> false
                n == 1 -> true
                else -> {
                    var num = n
                    while (num % 3 == 0) {
                        num /= 3
                        if (num == 1) break
                    }
                    return num == 1
                }
            }
             */
            /*
            思路:
            換底公式
            logb(a) = logc(a)/logc(b)
            log3(n) = log10(n)/log10(3)
            得知
             */
            if (n <= 0) return false
            return (log10(n.toDouble()) / log10(3.0)) % 1 == 0.0

            /*
            Follow up: Could you solve it without loops/recursion?
            Related Topics
            * Math
            * Recursion

            不能用 loops/recursion
             */
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}