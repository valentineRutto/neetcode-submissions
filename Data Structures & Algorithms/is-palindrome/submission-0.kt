class Solution {
    fun isPalindrome(s: String): Boolean {
    val f = s.filter { it.isLetterOrDigit() }.lowercase()
     var l = 0
     var r = f.length -1

     while(l<r){

           if( f[l] != f[r]){
return false

           }

l++
r--

     }
return true
    }
}
