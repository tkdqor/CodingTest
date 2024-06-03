class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        val remainder1 = number % n
        val remainder2 = number % m
        if (remainder1 == 0 && remainder2 == 0) {
            return 1
        } else {
            return 0
        }
    }
}