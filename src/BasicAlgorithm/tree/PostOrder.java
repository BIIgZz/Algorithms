package BasicAlgorithm.tree;

import java.util.Stack;

/**
 * @program: algorithm
 * @description: 非递归后序遍历二叉树
 * @author: zzh
 * @create: 2021-01-23 19:48
 **/
public class PostOrder {
    public void postOrder(TreeNode root){
        if (root == null)
            return;
         TreeNode treeNode = root ;
         TreeNode r;
         boolean flag ;
        //定义一个顺序栈
        Stack<TreeNode> stack = new Stack<TreeNode>();

        do{
            //扫描节点treenode的所有左下节点并进栈
            while (treeNode!=null){
                //节点进栈
                stack.push(treeNode);
                //移动到左孩子
                treeNode = treeNode.getLeft();
            }
            //r指向刚刚访问的节点，初始为空
            r = null;
            //为真表示正在处理栈顶节点
            flag = true;
            while (!stack.isEmpty()&&flag){
                //获得栈顶节点
                treeNode = stack.peek();
                //如果节点p的右孩子为空或者为刚刚访问过的节点
                if (treeNode.getRight() == r){
                    //访问节点
                    System.out.println(treeNode.getData());
                    //出栈
                    treeNode=stack.pop();
                    //指向刚刚访问的节点
                    r=treeNode;
                } else {
                    //指向右节点
                    treeNode = treeNode.getRight();
                    //表示当前不是栈顶节点
                    flag=false;
                }
            }
        }while (!stack.isEmpty());
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        BinaryTree bt = new BinaryTree(arr,0);
        PostOrder postOrder = new PostOrder();
        postOrder.postOrder(bt.root);
    }
}
