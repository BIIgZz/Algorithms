package BasicAlgorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: algorithm
 * @description: 二叉树的层次遍历
 * @author: zzh
 * @create: 2021-01-31 16:03
 **/
public class LevelOrder {
    public void levelOrder(TreeNode root){
        if (root==null)
            return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode t ;
        while (!queue.isEmpty()){
            t = queue.poll();
            System.out.println(t.getData());
            if (t.getLeft()!=null)queue.offer(t.getLeft());
            if (t.getRight()!=null)queue.offer(t.getRight());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        BinaryTree bt = new BinaryTree(arr,0);
        LevelOrder levelOrder = new LevelOrder();
        levelOrder.levelOrder(bt.root);
    }
}
