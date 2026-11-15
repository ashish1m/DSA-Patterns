package two_pointer

fun main() {
    val nums = intArrayOf(2, 1, 0, 2, 1, 1, 2, 1, 0, 0)
    sortColors(nums)
    println(nums.joinToString(", "))
}

fun sortColors(nums: IntArray): Unit {
    if (nums.size == 2) {
        if (nums[0] < nums[1]) {
            return
        } else {
            swapNum(nums, 0, 1)
        }
    } else {
        var low = 0
        var mid = 0
        var high = nums.lastIndex
        while (mid <= high) {
            if (nums[mid] == 0) {
                swapNum(nums, low, mid)
                low++
                mid++
            } else if (nums[mid] == 1) {
               mid++
            } else {
                swapNum(nums, mid, high)
                high--
            }
        }
    }
    return
}

fun swapNum(nums: IntArray, left: Int, right: Int) {
    val temp = nums[left]
    nums[left] = nums[right]
    nums[right] = temp
}