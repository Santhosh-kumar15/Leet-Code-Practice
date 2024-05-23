/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> temp = new LinkedList<>();
        int count;
        temp.add(root);
        while(!temp.isEmpty())
        {
            count = temp.size();
            for(int i=0;i<count;i++)
            {
                TreeNode curr = temp.poll();
                if(i==count-1)
                {
                    result.add(curr.val);
                }
                if(curr.left!=null)
                {
                    temp.add(curr.left);
                }
                if(curr.right!=null)
                {
                    temp.add(curr.right);
                }
            }
        }
        return result;
    }
}