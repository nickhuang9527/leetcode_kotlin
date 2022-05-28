//Given an array of integers nums and an integer target, return indices of the 
//two numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may 
//not use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// Only one valid answer exists. 
// 
//
// 
//Follow-up: Can you come up with an algorithm that is less than O(n²) time 
//complexity? Related Topics Array Hash Table 👍 32591 👎 1034


package leetcode.editor.en

class N1_TwoSum {

    /*
    思路 :
    用空間換時間
    用 map 存取減去 target 後的值當 key
    index 當 value
    每次進迴圈前, 先拿值查看是否已存在 map 中
    如果有代表 match, 即可得正

    time complexity : O(n)
    space complexity : O(n)
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            var map = mutableMapOf<Int, Int>()
            for (index in 0 until nums.count()) {
                val prevNumIndex = map[nums[index]]
                prevNumIndex?.let {
                    return intArrayOf(it, index)
                }
                map[target - nums[index]] = index
            }
            return intArrayOf()
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}