/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
var diameter = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
depth(root)
return diameter
    }

fun depth(root:TreeNode?):Int{

if(root == null) return 0
var left = depth(root.left)
var right = depth(root.right)

diameter = maxOf(diameter,left + right)

return 1 + maxOf(left,right)


}

}
