package two_pointer

// Find the count of the all the sub array with product less than K
fun main() {
    val nums = intArrayOf(10, 5, 2, 6)
    val k = 100
    println(numSubarrayProductLessThanK(nums, k))
}

fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    if (k <= 1) return 0

    var count = 0
    var product = 1
    var left = 0

    for (right in nums.indices) {
        product *= nums[right]
        while (product >= k) {
            product /= nums[left]
            left++
        }
        count += right - left + 1
    }

    return count
}