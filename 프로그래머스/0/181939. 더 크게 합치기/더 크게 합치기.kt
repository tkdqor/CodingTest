class Solution {
    fun solution(a: Int, b: Int): Int {
        val convertA = a.toString()
        val convertB = b.toString()
        val calculateA = (convertA + convertB).toInt()
        val calculateB = (convertB + convertA).toInt()
        if (calculateA > calculateB) {
            return calculateA
        } else {
            return calculateB
        }
    }
}