class Solution {
    fun search(nums: IntArray, target: Int): Int {

var low = 0

var high = nums.lastIndex

while(low <= high){

    var mid = low+(high - low )/ 2
    
    if(nums[mid] == target ) return mid

    if(nums[mid] < target){
        low = mid +1 
    }else {
        high = mid -1
    }

}
return -1
    }

}
