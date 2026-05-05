class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
var seen = HashSet<Int>()
for(n in nums){
    if(seen.contains(n)) return true
    seen.add(n)
}
return false
    }
}
