class Solution {
    fun solution(a: Int, b: Int): Int {
        val result1 = (a.toString() + b.toString()).toInt()
        val result2 = 2 * a * b
        if (result1 > result2) {
            return result1
        } else if (result1 < result2) {
            return result2
        } else {
            return result1
        }
    }
}