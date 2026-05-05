class Solution {

    fun twoSum(n: IntArray, t: Int): IntArray {
var l = 0
var r = n.size - 1

while( l < r){

val sum = n[l] + n[r]

when{

sum == t -> return intArrayOf(l+1, r+1)
sum < t -> l++
else -> r--

}

}

return intArrayOf()

}}
