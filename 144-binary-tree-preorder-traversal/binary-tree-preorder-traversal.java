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
class Solution 
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> ans1 = new ArrayList<>();

        ans(ans1,root);

        return ans1;
    }

    public static void ans(List<Integer> ans1, TreeNode root)
    {
        if(root==null)
        return;

        ans1.add(root.val);
        ans(ans1,root.left);
        ans(ans1,root.right);
    }
}