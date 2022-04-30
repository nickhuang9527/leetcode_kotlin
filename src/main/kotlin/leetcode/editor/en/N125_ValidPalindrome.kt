//A phrase is a palindrome if, after converting all uppercase letters into 
//lowercase letters and removing all non-alphanumeric characters, it reads the same 
//forward and backward. Alphanumeric characters include letters and numbers. 
//
// Given a string s, return true if it is a palindrome, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
// 
//
// Example 2: 
//
// 
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric 
//characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// s consists only of printable ASCII characters. 
// 
// Related Topics Two Pointers String 👍 3559 👎 5128


package leetcode.editor.en

class N125_ValidPalindrome {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPalindrome(s: String): Boolean {
            var headIndex = 0
            var tailIndex = s.length - 1
            var isPalindrome = true

            while (headIndex <= tailIndex) {
                val headChar = s[headIndex].toLowerCase()
                val tailChar = s[tailIndex].toLowerCase()
                if (headChar !in 'a' .. 'z' && headChar !in '0' .. '9') {
                    headIndex += 1
                    continue
                }
                if (tailChar !in 'a' .. 'z' && tailChar !in '0' .. '9') {
                    tailIndex -= 1
                    continue
                }
                if (headChar == tailChar) {
                    headIndex += 1
                    tailIndex -= 1
                } else {
                    isPalindrome = false
                    break
                }
            }
            return isPalindrome
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}