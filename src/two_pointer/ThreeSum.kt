package two_pointer

fun main() {
    val nums = intArrayOf(0, 0, 0)
    println(threeSum(nums))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()
    println(nums.joinToString(", "))
    for (i in 0..<nums.lastIndex - 1) {
        //Now find two sum
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue
        }

        var pStart = i + 1
        var pEnd = nums.lastIndex
        val target = nums[i]
        while (pStart < pEnd) {
            val p1 = nums[pStart]
            val p2 = nums[pEnd]
            val sum = p1 + p2
            if (sum < -target) {
                pStart++
            } else if (sum > -target) {
                pEnd--
            } else {
                //Also handle duplicates here
                result.add(listOf(target, p1, p2))
                pStart++
                pEnd--
                while (pStart < nums.size && nums[pStart] == nums[pStart - 1]) {
                    pStart++
                }

                while (pEnd >= 0 && nums[pEnd] == nums[pEnd + 1]) {
                    pEnd--
                }
            }
        }
    }
    return result
}