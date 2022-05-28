//Given a non-empty array of integers nums, every element appears twice except 
//for one. Find that single one. 
//
// You must implement a solution with a linear runtime complexity and use only 
//constant extra space. 
//
// 
// Example 1: 
// Input: nums = [2,2,1]
//Output: 1
// Example 2: 
// Input: nums = [4,1,2,1,2]
//Output: 4
// Example 3: 
// Input: nums = [1]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -3 * 10⁴ <= nums[i] <= 3 * 10⁴ 
// Each element in the array appears twice except for one element which appears 
//only once. 
// 
// Related Topics Array Bit Manipulation 👍 9889 👎 362


package leetcode.editor.en

class N136_SingleNumber {

    /*
    這題可以用 xor 互斥或閘
    真值表
    ---------------
    | A | B | XOR |
    ---------------
    | 0 | 0 |  0  |
    | 0 | 1 |  1  |
    | 1 | 0 |  1  |
    | 1 | 1 |  0  |
    ---------------
    可以發現同數字出現兩次, xor 後就會是0
    所以將 array 逐一做 xor 就能找到唯一不樣的值
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun singleNumber(nums: IntArray): Int {
            var result = 0
            for (num in nums) {
                result = result xor num
            }
            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}