class Solution {
    fun solution(num_list: IntArray): Int {
        var even: String = ""
        var odd: String = ""
        num_list.map { it ->
            if (it % 2 == 0) {
                even += it
            } else {
                odd += it
            }
        }
        return even.toInt() + odd.toInt()
    }
}