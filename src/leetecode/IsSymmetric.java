package leetecode;
/**
 *
 *
 *@description: leetecode 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 *@author: zzh
 *@time: 2021/3/26 下午3:54
 * 
 */
class TreeNode101 {
    int val;
    TreeNode101 left;
    TreeNode101 right;
    TreeNode101() {}
    TreeNode101(int val) { this.val = val; }
    TreeNode101(int val, TreeNode101 left,TreeNode101 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IsSymmetric {
        public boolean isSymmetric(TreeNode101 root) {
            if (root==null)
                return true;
            return symmetric(root,root);

        }
        private boolean symmetric(TreeNode101 left, TreeNode101 right) {
            if (left==null&&right==null)
                return true;
            if (left==null||right==null)
                return false;
            if (left.val!=right.val)
                return false;

            return symmetric(left.left,right.right)&&symmetric(left.right, right.left);
        }
    }
