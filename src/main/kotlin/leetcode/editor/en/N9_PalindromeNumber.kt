//Given an integer x, return true if x is palindrome integer. 
//
// An integer is a palindrome when it reads the same backward as forward. 
//
// 
// For example, 121 is a palindrome while 123 is not. 
// 
//
// 
// Example 1: 
//
// 
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
// 
//
// Example 2: 
//
// 
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it 
//becomes 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you solve it without converting the integer to a string? 
//Related Topics Math 👍 5641 👎 2103


package leetcode.editor.en

class N9_PalindromeNumber {

    /*
    思路:
    最簡單的方式就是轉成string在reverse, 題目後面有說到用不轉string的方式解決此問題
    可以用%取餘數給反向數的方式解決
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
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPalindrome(x: Int): Boolean {
            if (x < 0) return false

            var num = x
            var reverseNum = 0

            while (num != 0) {
                reverseNum = reverseNum * 10 + num % 10
                num /= 10
            }
            return reverseNum == x
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}