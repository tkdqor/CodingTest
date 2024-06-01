class Solution {
    fun solution(num: Int, n: Int): Int {
        // 코틀린 산술연산자 중, /는 나누었을 때 몫이고, %는 나머지를 리턴
        val answer = num % n
        if (answer != 0) {
            return 0
        } else {
            return 1
        }
    }
}