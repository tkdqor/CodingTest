// class Solution {
//     fun solution(code: String): String {
//         var mode: Int = 0
//         var ret: String = ""
//         code.mapIndexed { index, it ->
//             // mode 설정하기
//             if (it == '1' && mode == 0) {
//                 mode = 1
//             } else if (it == '1' && mode == 1) {
//                 mode = 0
//             } else {
//                 // if문 종료
//                 return@mapIndexed // mapIndexed 함수를 빠져나가기
//             }
            
//             // ret 문자열 만들기
//             if (it != '1' && mode == 0 && (index % 2 == 0)) {
//                 ret += it
//             } else if (it != '1' && mode == 1 && (index % 2 != 0)) {
//                 ret += it
//             } else {
//                 // if문 종료
//                 return@mapIndexed // mapIndexed 함수를 빠져나가기
//             }
//         }
//         return if (ret.isNotEmpty()) ret else "EMPTY"
//     }
// }

class Solution {
    fun solution(code: String): String {
        val ret = StringBuilder()
        var mode = 0
        code.forEachIndexed { index, _ ->
            if (code[index] == '1') {
                mode = 1 - mode
            } else if (index % 2 == mode) { // ex)mode가 0이고 idx가 짝수일 때 추가하니까 이런 조건을 설정
                ret.append(code[index])
            }
        }
        return ret.toString().ifEmpty { "EMPTY" }
    }
}
