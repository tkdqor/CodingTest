class Solution {
    fun solution(num_list: IntArray): IntArray {
        // 코틀린 apply()라는 범위 지정 함수 사용하기
        val answer = num_list.toMutableList().apply {
            val (first, second) = num_list.takeLast(2)
            if (first < second) add(second - first)
            else add(second + second)
        }
        return answer.toIntArray()
    }
}