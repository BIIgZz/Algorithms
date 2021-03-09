package leetecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * @program: algorithm
 * @description: 102.二叉树的层次遍历
 * @author: zzh
 * @create: 2021-01-31 16:14
 **/

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root==null)
            return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode t ;
        //设置队头front，队尾rear，每层末尾last
        int rear=1,front=0,last=1;
        //每层元素集合
        List<Integer> level = new ArrayList<>();
        while (!queue.isEmpty()){
            //出队
            t = queue.poll();
            //进入层序集合
            level.add(t.val);
            //队头前进
            front++;
            //左孩子 进队jhk    ds
            if (t.left!=null){
                queue.offer(t.left);
                rear++;
            }
            //右孩子进队
            if (t.right!=null){
                queue.offer(t.right);
                rear++;
            }
            //到达每层末尾 将该层元素加入结果集，将last设置成下一层的末尾
            if (last==front){
                result.add(level);
                level = new ArrayList<>();
                last = rear;
            }
        }
        return result;
    }
}
