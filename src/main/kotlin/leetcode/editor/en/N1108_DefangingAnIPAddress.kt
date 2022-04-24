//Given a valid (IPv4) IP address, return a defanged version of that IP address.
// 
//
// A defanged IP address replaces every period "." with "[.]". 
//
// 
// Example 1: 
// Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
// Example 2: 
// Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
// 
// 
// Constraints: 
//
// 
// The given address is a valid IPv4 address. 
// Related Topics String 👍 1078 👎 1459


package leetcode.editor.en

class N1108_DefangingAnIPAddress {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun defangIPaddr(address: String): String {
            var result = ""
            address.forEach {
                when (it) {
                    '.' -> result += "[.]"
                    else -> result += it.toString()
                }
            }
            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}