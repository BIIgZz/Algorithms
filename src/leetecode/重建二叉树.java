package leetecode;

import java.util.HashMap;

/**
 * @program: algorithm
 * @description: 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * @author: zzh
 * @create: 2020-06-15 20:44
 **/
public class 重建二叉树 {

    HashMap<Integer,Integer> hashMap = new HashMap();
    int preorder[];

    public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
        for (int i = 0; i < preorder.length; i++) {
            hashMap.put(inorder[i],i);
        }
       return reCreat(0,0,inorder.length-1);
    }
    public TreeNode reCreat(int pre_root_index,int in_left_index,int in_right_index){
        if (in_left_index>in_right_index){
            return null;
        }

        TreeNode root = new TreeNode(preorder[pre_root_index]);
        int in_index = hashMap.get(preorder[pre_root_index]);

        root.left = reCreat(pre_root_index+1,in_left_index,in_index-1);

        root.right = reCreat(pre_root_index+(in_index-in_left_index)+1,in_index+1,in_right_index);

        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
