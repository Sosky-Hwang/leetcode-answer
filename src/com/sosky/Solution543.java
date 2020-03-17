package com.sosky;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 */
public class Solution543 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode tr2 = new TreeNode(2);
        TreeNode tr3 = new TreeNode(3);
        TreeNode tr4 = new TreeNode(4);
        TreeNode tr5 = new TreeNode(5);
        root.left = tr2;
        root.right = tr3;
        tr2.left = tr4;
        tr2.right = tr5;
        System.out.println(diameterOfBinaryTree(root));
    }

    private static int ans;

    public static int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    public static int depth(TreeNode node) {
        if (node == null) {
            return 0; // 访问到空节点了，返回0
        }
        int L = depth(node.left); // 左儿子为根的子树的深度
        int R = depth(node.right); // 右儿子为根的子树的深度
        ans = Math.max(ans, L + R + 1); // 计算d_node即L+R+1 并更新ans
        return Math.max(L, R) + 1; // 返回该节点为根的子树的深度
    }
}
