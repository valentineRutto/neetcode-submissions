class Solution {
    fun maxArea(h: IntArray): Int {
      var ma = 0 
var l = 0
var r = h.size - 1

while(l<r) {
    val he = minOf(h[l], h[r])
    val w =  r-l
    var a = w * he

    ma = maxOf(ma, a)

    if(h[l]<h[r]){
        l ++
    }else{r --}


}

return ma

    }
}
