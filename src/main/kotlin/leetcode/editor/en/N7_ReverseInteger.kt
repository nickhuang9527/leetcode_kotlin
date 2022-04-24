//Given a signed 32-bit integer x, return x with its digits reversed. If 
//reversing x causes the value to go outside the signed 32-bit integer range [-2³¹, 2³¹ -
// 1], then return 0. 
//
// Assume the environment does not allow you to store 64-bit integers (signed 
//or unsigned). 
//
// 
// Example 1: 
//
// 
//Input: x = 123
//Output: 321
// 
//
// Example 2: 
//
// 
//Input: x = -123
//Output: -321
// 
//
// Example 3: 
//
// 
//Input: x = 120
//Output: 21
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
// Related Topics Math 👍 7026 👎 9641


package leetcode.editor.en

/*
    思路:
    可以用%取餘數給反向數的方式解決, 最後在判斷結果是否在範圍內
    e.g
    num = 121
    reverseNum = 0
    121 % 10 = 1 (reverseNum * 10 + 1)
    121 / 10 = 12


    num = 12
    reverseNum = 1
    12 % 10 = 2 (reverseNum * 10 + 2)
    12 / 10 = 1

    num = 1
    reverseNum = 12
    1 % 10 = 1 (reverseNum * 10 + 1)
    1 / 10 = 0

    num = 0
    reverseNum = 121
     */

class N7_ReverseInteger {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverse(x: Int): Int {
            var num = x.toLong()
            var reverseNum: Long = 0

            while (num != 0L) {
                println("reverseNum1 = $reverseNum")
                println("num1 = $num")
                println("reverseNum * 10 : ${reverseNum * 10}")
                println("num % 10 : ${num % 10}")
                reverseNum = reverseNum * 10 + num % 10
                num /= 10
                println("reverseNum = $reverseNum")
                println("num = $num")
            }

            if (reverseNum > ((1 shl 31) - 1) || reverseNum < -(1 shl 31)) {
                reverseNum = 0
            }
            println("${((1 shl 31) - 1)}")
            println("${-(1 shl 31)}")

            return reverseNum.toInt()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}