//You are climbing a staircase. It takes n steps to reach the top. 
//
// Each time you can either climb 1 or 2 steps. In how many distinct ways can 
//you climb to the top? 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 45 
// 
// Related Topics Math Dynamic Programming Memoization 👍 11617 👎 361


package leetcode.editor.en

class N70_ClimbingStairs {

    /*
    思路:
    staircase 1
    1
    staircase 2
    1, 1
    2
    staircase 3
    1, 1, 1
    1, 2
    2, 1

    基礎規則為踩 1 & 2 階, 根據規則可拆分為兩種踩法
    1. 已經踩 1 階 + 剩餘 (n-1) 階
    2. 已經踩 2 階 + 剩餘 (n-2) 階
    (n - 1) 階又可拆成
    1. 踩 1 階 + 剩餘 ((n-1)-1) 階
    2. 踩 2 階 + 剩餘 ((n-1)-2) 階
    (n - 2) 階又可拆成
    1. 踩 1 階 + 剩餘 ((n-2)-1) 階
    2. 踩 2 階 + 剩餘 ((n-2)-2) 階
    以此類推

    使用遞迴
    F(0) = 0
    F(1) = 1
    F(2) = 2
    F(n) = F(n - 1) + F(n - 2)

    出現 Time Limit Exceeded

    改成迴圈加快速度減少 call stack
    用陣列紀錄計算結果, 就能拿之前的計算結果相加, 用空間換時間
    ways[it] = ways[it - 1] + ways[it - 2]

    省空間做法, 用兩個數紀錄已踩1階及已踩2階的結果
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun climbStairs(n: Int): Int {
            /*
            [solution1]
            if (n <= 2) return n
            return climbStairs(n - 1) + climbStairs(n - 2)
             */
            /*
            [solution2]
            if (n <= 2) return n

            val ways = IntArray(n + 1) { 0 }
            ways[1] = 1
            ways[2] = 2
            (3..n).forEach {
                ways[it] = ways[it - 1] + ways[it - 2]
            }
            return ways[n]
             */
            if (n <= 2) return n

            var prevPrevWays = 1
            var prevWays = 2
            var result = 0

            (3..n).forEach {
                result =  prevWays + prevPrevWays
                prevPrevWays = prevWays
                prevWays = result
            }
            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}