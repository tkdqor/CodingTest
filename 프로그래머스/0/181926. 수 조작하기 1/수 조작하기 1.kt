class Solution {
    fun solution(n: Int, control: String): Int {
        var result = n
        control.forEach { it ->
            // string 1개를 비교할 땐 "w"가 아니라 'w'
            // 어떤 변수에 수를 더하고 그 더한 값을 사용하기 위해서는 단순힌 +,-가 아닌 +=, -=를 사용하기
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
