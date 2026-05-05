class Solution {
    fun maxProfit(prices: IntArray): Int {
     var maxP = 0
     var minP = Int.MAX_VALUE

for(p in prices ){

    if(p < minP ){
        minP = p
    }

    val profit = p - minP
  maxP = maxOf(profit, maxP)


}
return maxP

    }
}
