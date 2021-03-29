package leetecode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 *@description: leetecode 236. 二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 *@author: zzh
 *@time: 2021/3/29 上午8:34

 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if (root == null || root == p|| root == q) return root;
       TreeNode left= lowestCommonAncestor(root.left,p,q);
       TreeNode right = lowestCommonAncestor(root.right,p,q);
       if (left==null) return right;
       if (right==null) return left;
       return root;

}
