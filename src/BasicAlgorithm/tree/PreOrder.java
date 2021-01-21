package BasicAlgorithm.tree;

import java.util.Stack;

/**
 * @program: algorithm
 * @description: 非递归先序遍历
 * @author: zzh
 * @create: 2021-01-21 22:48
 **/
public class PreOrder {
    public void preOrder(TreeNode root){
        if (root == null)
            return;
        TreeNode treeNode =root;
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode!=null||!stack.isEmpty()){
            while (treeNode!=null){
                System.out.println(treeNode.getData());
                stack.push(treeNode);
                treeNode=treeNode.getLeft();
            }
            if(!stack.isEmpty()){
                treeNode=stack.pop();
                treeNode=treeNode.getRight();
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        BinaryTree bt = new BinaryTree(arr,0);
        PreOrder preOrder = new PreOrder();
        preOrder.preOrder(bt.root);
    }
}
