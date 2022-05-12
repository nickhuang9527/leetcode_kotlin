////You are given an array prices where prices[i] is the price of a given stock 
//
////on the iᵗʰ day. 
////
//// You want to maximize your profit by choosing a single day to buy one stock 
//
////and choosing a different day in the future to sell that stock. 
////
//// Return the maximum profit you can achieve from this transaction. If you 
////cannot achieve any profit, return 0. 
////
//// 
//// Example 1: 
////
//// 
////Input: prices = [7,1,5,3,6,4]
////Output: 5
////Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit 
//= 
////6-1 = 5.
////Note that buying on day 2 and selling on day 1 is not allowed because you 
////must buy before you sell.
//// 
////
//// Example 2: 
////
//// 
////Input: prices = [7,6,4,3,1]
////Output: 0
////Explanation: In this case, no transactions are done and the max profit = 0.
//// 
////
//// 
//// Constraints: 
////
//// 
//// 1 <= prices.length <= 10⁵ 
//// 0 <= prices[i] <= 10⁴ 
//// 
//// Related Topics Array Dynamic Programming 👍 15987 👎 536
//


package leetcode.editor.en

import kotlin.math.max

class N121_BestTimeToBuyAndSellStock {

    /*
    思路:
        跑兩層for
        第一層是 buy price
        第二層是 sell price
        相減大於 maximum profit 則
        time complexity : O(n ^ 2)

        結果 : Time Limit Exceeded

        需要比 n ^ 2 更快

        紀錄 buyprice sellprice
        time complexity : O(n)
     */

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxProfit(prices: IntArray): Int {
            /*
            var maximumProfit = 0
            for (buyIndex in 0 until prices.size) {
                val buyPrice = prices[buyIndex]
                for (sellIndex in (buyIndex+1) until prices.size) {
                    val sellPrice = prices[sellIndex]
                    val profit = sellPrice - buyPrice
                    if (profit > maximumProfit) {
                        maximumProfit = profit
                    }
                }
            }
            return maximumProfit
             */

            var maximumProfit = 0
            var buyPrice = Int.MAX_VALUE
            var sellPrice = 0
            var holdDays = 0

            for (index in 0 until prices.size) {
                val currentPrice = prices[index]
                if (currentPrice <= buyPrice) {
                    buyPrice = currentPrice
                    sellPrice = 0
                    holdDays = 0
                }

                if (holdDays <= 0) {
                    holdDays++
                    continue
                }

                if (currentPrice > sellPrice) {
                    sellPrice = currentPrice
                }
                val profit = sellPrice - buyPrice
                if (profit > maximumProfit) {
                    maximumProfit = profit
                }
            }

            return maximumProfit
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}