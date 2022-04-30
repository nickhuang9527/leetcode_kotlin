//Implement strStr(). 
//
// Given two strings needle and haystack, return the index of the first 
//occurrence of needle in haystack, or -1 if needle is not part of haystack. 
//
// Clarification: 
//
// What should we return when needle is an empty string? This is a great 
//question to ask during an interview. 
//
// For the purpose of this problem, we will return 0 when needle is an empty 
//string. This is consistent to C's strstr() and Java's indexOf(). 
//
// 
// Example 1: 
//
// 
//Input: haystack = "hello", needle = "ll"
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1
// 
//
// 
// Constraints: 
//
// 
// 1 <= haystack.length, needle.length <= 10⁴ 
// haystack and needle consist of only lowercase English characters. 
// 
// Related Topics Two Pointers String String Matching 👍 3933 👎 3625


package leetcode.editor.en

class N28_ImplementStrStr() {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun strStr(haystack: String, needle: String): Int {
            var result = -1

            if (needle.isEmpty()) return 0
            if (haystack.length < needle.length) return -1

            for (haystackIndex in haystack.indices) {
                if (haystack[haystackIndex] == needle.first()) {
                    var isMatch = true
                    for (needleIndex in needle.indices) {
                        val compareHaystackIndex = haystackIndex + needleIndex
                        if (compareHaystackIndex > haystack.length - 1 || needle[needleIndex] != haystack[haystackIndex + needleIndex]) {
                            isMatch = false
                            break
                        }
                    }
                    if (isMatch) {
                        result = haystackIndex
                        break
                    }
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}