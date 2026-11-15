package two_pointer

//Remove duplicates for a sorted array keep duplicates to max 2

fun main() {
    val inpArray = intArrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5)

    println(removeDuplicates2(inpArray))
}

fun removeDuplicates2(nums: IntArray): Int {
    var p1 = 0
    var p2 = 1
    var uCount = 1

    while (p2 < nums.size) {
        if(nums[p1] == nums[p2]) {
            uCount++
            if (p1 + 1 == p2 && uCount < 3) {
                p1++
                p2++
            } else if (uCount < 3) {
                nums[p1 + 1] = nums[p2]
                nums[p2] = -1
                p1++
                p2++
            } else {
                p2++
            }
        } else if(p1 + 1 == p2) {
            uCount = 1
            p1++
            p2++
        } else {
            uCount = 1
            nums[p1 + 1] = nums[p2]
            nums[p2] = -1
            p1++
            p2++
        }

        println("p1=$p1 p2=$p2 uCount=$uCount nums=${nums.joinToString()}")
    }

    return p1 + 1
}