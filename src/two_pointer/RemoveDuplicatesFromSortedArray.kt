package two_pointer

//Remove duplicates for a sorted array

fun main() {
    val inpArray = intArrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5)

   println(removeDuplicates(inpArray))
}

fun removeDuplicates(nums: IntArray): Int {
    var p1 = 0
    var p2 = 1

    while (p2 < nums.size) {
        if (nums[p1] == nums[p2]) {
            nums[p2] = 0
            p2++
        } else if (nums[p1 + 1] == nums[p2]) {
            p1++
            p2++
        } else {
            nums[p1 + 1] = nums[p2]
            nums[p2] = 0
            p1++
            p2++
        }
    }

    return p1 + 1
}