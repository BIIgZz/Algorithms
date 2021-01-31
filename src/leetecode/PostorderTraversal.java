package leetecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: algorithm
 * @description: 145. 二叉树的后序遍历
 * @author: zzh
 * @create: 2021-01-31 20:53
 **/
public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        TreeNode treeNode = root;
        //为空返回结果
        if (treeNode == null)
            return result;
        //定义一个顺序栈
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp ;
        boolean flag;

        do {
            //扫描节点的左孩子是否为空并且进栈
            while (treeNode != null){
                //节点进栈
                stack.push(treeNode);
                //移动到左孩子
                treeNode = treeNode.left;
            }
            //temp指向刚刚访问的节点，初始为空
            temp = null;
            //表示该节点是否已经处理，true表示已经处理
            flag = true;
            while (!stack.isEmpty()&&flag){
                //获得栈顶节点
                treeNode = stack.peek();
                //如果节点p的右孩子为空或者为刚刚访问过的节点
                if (treeNode.right == temp){
                    //访问该节点
                    result.add(treeNode.val);
                    //出栈
                    treeNode = stack.pop();
                    //指向刚刚访问过的节点
                    temp = treeNode;
                }else{
                    //指向右节点
                    treeNode = treeNode.right;
                    //表示不是栈顶节点
                    flag = false;
                }
            }
        }while (!stack.isEmpty());

        return result;
    }
}
