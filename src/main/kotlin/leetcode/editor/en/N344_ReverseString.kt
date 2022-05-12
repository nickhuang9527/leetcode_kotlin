//Write a function that reverses a string. The input string is given as an 
//array of characters s. 
//
// You must do this by modifying the input array in-place with O(1) extra 
//memory. 
//
// 
// Example 1: 
// Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
// Example 2: 
// Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] is a printable ascii character. 
// 
// Related Topics Two Pointers String Recursion 👍 4991 👎 945


package leetcode.editor.en

class N344_ReverseString {

    /*
    思路:
    頭尾調換
    - startIndex++
    - endIndex--
    直到 start >= end 結束掉換

    h e l l o
    |       |
    s       e

    o e l l h
      |   |
      s   e
    o l l e h
        |
        se

    space complexity: O(1)
    time complexity: O(n/2 = n) O(n)
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverseString(s: CharArray): Unit {
            var startIndex = 0
            var endIndex = s.size - 1

            while (startIndex < endIndex) {
                val tmp = s[startIndex]
                s[startIndex] = s[endIndex]
                s[endIndex] = tmp
                startIndex++
                endIndex--
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}