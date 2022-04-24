//You're given strings jewels representing the types of stones that are jewels, 
//and stones representing the stones you have. Each character in stones is a type 
//of stone you have. You want to know how many of the stones you have are also 
//jewels. 
//
// Letters are case sensitive, so "a" is considered a different type of stone 
//from "A". 
//
// 
// Example 1: 
// Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
// Example 2: 
// Input: jewels = "z", stones = "ZZ"
//Output: 0
// 
// 
// Constraints: 
//
// 
// 1 <= jewels.length, stones.length <= 50 
// jewels and stones consist of only English letters. 
// All the characters of jewels are unique. 
// 
// Related Topics Hash Table String 👍 3488 👎 484


package leetcode.editor.en

class N771_JewelsAndStones {

    /*
    思路:
    用 Map Counter 計算所有石頭數量, 在用 寶石 尋找 石頭Counter 裡是 寶石 的石頭, 取出數量相加
    用 Counter 好處是不需要每次要找寶石就需要重新 for 迴圈一次 stones, 以空間換時間
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun numJewelsInStones(jewels: String, stones: String): Int {
            val stonesCounterMap: MutableMap<Char, Int> = mutableMapOf()
            stones.forEach {
                val stoneCount = stonesCounterMap[it]
                if (stoneCount == null) {
                    stonesCounterMap[it] = 1
                } else {
                    stonesCounterMap[it] = stoneCount + 1
                }
            }

            var numOfJewels = 0
            jewels.forEach {
                numOfJewels += stonesCounterMap[it] ?: 0
            }
            return numOfJewels
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}