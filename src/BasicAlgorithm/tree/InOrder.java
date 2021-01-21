package BasicAlgorithm.tree;

import java.util.Stack;

/**
 * @program: algorithm
 * @description: 非递归中序遍历二叉树
 * @author: zzh
 * @create: 2021-01-21 21:30
 **/
public class InOrder {
    public void inOrder(TreeNode root){
        if (root==null)
            return;
        TreeNode treeNode = root;
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode!=null||!stack.isEmpty()){
            if (treeNode!=null){
                stack.push(treeNode);
                treeNode=treeNode.getLeft();
            }else{
                treeNode = stack.pop();
                System.out.println(treeNode.getData());
                treeNode = treeNode.getRight();
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        BinaryTree bt = new BinaryTree(arr,0);
        InOrder inOrder = new InOrder();
        inOrder.inOrder(bt.root);
    }
}
