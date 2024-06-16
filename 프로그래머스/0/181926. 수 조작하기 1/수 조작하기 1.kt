class Solution {
    fun solution(n: Int, control: String): Int {
        var result = n
        control.forEach { it ->
            // string 1개를 비교할 땐 "w"가 아니라 'w'
            if (it == 'w') {
                result += 1
            } else if (it == 's') {
                result -= 1
            } else if (it == 'd') {
                result += 10
            } else {
                result -= 10
            }
        }
        return result
    }
}