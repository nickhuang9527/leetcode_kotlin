////Given an integer n, return a string array answer (1-indexed) where: 
////
//// 
//// answer[i] == "FizzBuzz" if i is divisible by 3 and 5. 
//// answer[i] == "Fizz" if i is divisible by 3. 
//// answer[i] == "Buzz" if i is divisible by 5. 
//// answer[i] == i (as a string) if none of the above conditions are true. 
//// 
////
//// 
//// Example 1: 
//// Input: n = 3
////Output: ["1","2","Fizz"]
//// Example 2: 
//// Input: n = 5
////Output: ["1","2","Fizz","4","Buzz"]
//// Example 3: 
//// Input: n = 15
////Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz",
//"1
////3","14","FizzBuzz"]
//// 
//// 
//// Constraints: 
////
//// 
//// 1 <= n <= 10⁴ 
//// 
//// Related Topics Math String Simulation 👍 342 👎 60
//


package leetcode.editor.en

class N412_FizzBuzz {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun fizzBuzz(n: Int): List<String> {
            return (1..n).map {
                when {
                    it % 15 == 0 -> "FizzBuzz"
                    it % 5 == 0 -> "Buzz"
                    it % 3 == 0 -> "Fizz"
                    else -> "$it"
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}