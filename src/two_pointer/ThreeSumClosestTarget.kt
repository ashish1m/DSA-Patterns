package two_pointer

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(-1,2,1,-4)
    println(threeSumClosest(nums, 1))
}

fun threeSumClosest(nums: IntArray, target: Int): Int {
    nums.sort()
    var closest = nums[0] + nums[1] + nums[2]
    for (i in 0..<nums.lastIndex - 1) {
        var pStart = i + 1
        var pEnd = nums.lastIndex
        while (pStart < pEnd) {
            val sum = nums[i] + nums[pStart] + nums[pEnd]
            val diff = abs(target - sum)
            if (sum < target) {
                if (diff < abs(target - closest)) {
                    closest = sum
                }
                pStart++
            } else if (sum > target) {
                if (diff < abs(target - closest)) {
                    closest = sum
                }
                pEnd--
            } else {
                closest = sum
                break
            }
        }
    }
    return closest
}