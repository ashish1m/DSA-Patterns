package two_pointer

fun main() {
    val nums = intArrayOf(4, 11, 15, 2, 8, 5, 13)
    val targetSum = 19
    println(twoSumReturnIndex(nums, targetSum).joinToString(", "))
}

fun twoSumReturnIndex(nums: IntArray, target: Int): IntArray {
    val hashMap = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        val compliment = target - nums[i]
        if (hashMap.containsKey(compliment)) {
            return intArrayOf(hashMap[compliment]!!, i)
        } else {
            hashMap[nums[i]] = i
        }
    }
    return intArrayOf()
}
