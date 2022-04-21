//Given an integer num, repeatedly add all its digits until the result has only 
//one digit, and return it. 
//
// 
// Example 1: 
//
// 
//Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2 
//Since 2 has only one digit, return it.
// 
//
// Example 2: 
//
// 
//Input: num = 0
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= num <= 2³¹ - 1 
// 
//
// 
// Follow up: Could you do it without any loop/recursion in O(1) runtime? 
// Related Topics Math Simulation Number Theory 👍 2414 👎 1644


package leetcode.editor.en

class N258_AddDigits {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun addDigits(num: Int): Int {
            /* Solution 1
            var result = num
            while (result / 10 > 0) {
                var tmp = result
                var tmp2 = 0
                while (tmp / 10 > 0) {
                    val number = (tmp % 10)
                    tmp2 += number
                    tmp /= 10
                }
                tmp2 += tmp

                result = tmp2

            }
            return result
             */

            /*

             */
            return when {
                num == 0 -> 0
                num % 9 == 0 -> 9
                else -> num % 9
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}