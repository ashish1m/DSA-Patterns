package two_pointer

fun main() {
    val nums1 = intArrayOf(2, 3, 5, 12, 18, 25, 33)
    val nums2 = intArrayOf(-14, -11, -5, 2, 4, 7, 13)
    println(sortedSquares(nums1).joinToString(", "))
    println(sortedSquares(nums2).joinToString(", "))
}

fun sortedSquares(nums: IntArray): IntArray {
    var pStart = 0
    var pEnd = nums.size - 1
    val result = IntArray(nums.size)
    for (i in nums.indices.reversed()) {
        val pStartSq = nums[pStart] * nums[pStart]
        val pEndSq = nums[pEnd] * nums[pEnd]
        if (pStartSq < pEndSq) {
            result[i] = pEndSq
            pEnd--
        } else {
            result[i] = pStartSq
            pStart++
        }
    }
    return result
}