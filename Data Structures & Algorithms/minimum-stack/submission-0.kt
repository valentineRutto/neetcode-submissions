class MinStack() {

private val a = ArrayDeque<Int>()

private val min = ArrayDeque<Int>()

 fun push(`val`: Int) {
a.addLast(`val`)

if(min.isEmpty()){
    min.addLast(`val`)
}else{
min.addLast(minOf(`val`, min.last()))
}
  }


    fun pop() {
a.removeLast()
min.removeLast()

 }

    fun top(): Int {
return a.last()
    }

    fun getMin(): Int {
   return min.last()

}}
