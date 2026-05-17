/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    fun maxDepth(root: TreeNode?): Int {


if(root == null ) return 0

var leftdepth = maxDepth(root.left)
var rightdepth = maxDepth(root.right)

return 1 + maxOf(leftdepth , rightdepth)



    }
}
