class Solution {

    fun isValid(s: String): Boolean {

val a = ArrayDeque<Char>() 

 for(c in s){

    when(c){

  '(', '{', '[' -> a.addLast(c)

')' -> if(a.isEmpty() || a.removeLast() != '(') return false
'}' -> if(a.isEmpty() || a.removeLast() != '{' ) return false

']' -> if(a.isEmpty() || a.removeLast() != '[' ) return false
    }


}
return a.isEmpty()

//  val stack = ArrayDeque<Char>()
//     for (char in s) {
//         when (char) {
//             '(', '{', '[' -> stack.addLast(char)
//             ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
//             '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
//             ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
//         }
//     }
//     return stack.isEmpty()
    }
    }

