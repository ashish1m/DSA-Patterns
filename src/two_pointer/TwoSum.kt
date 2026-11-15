package two_pointer

//Given an array, find the pair which matches the target sum.

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val targetSum = 9
    println(twoSum(nums, targetSum).joinToString(", "))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var pStart = 0
    var pEnd = nums.size - 1

    while (pStart < pEnd) {
        val p1 = nums[pStart]
        val p2 = nums[pEnd]
        val sum = p1 + p2
        if (sum < target) {
            pStart++
        } else if (sum > target) {
            pEnd--
        } else {
            break
        }
    }

    return intArrayOf(pStart, pEnd)
}

