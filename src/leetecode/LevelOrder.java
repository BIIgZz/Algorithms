package leetecode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
/**
 *
 *
 *@description: leetecode 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *@author: zzh
 *@time: 2021/3/28 下午8:42
 * 
 */
class TreeNode102 {
      int val;
      TreeNode102 left;
      TreeNode102 right;
      TreeNode102() {}
      TreeNode102(int val) { this.val = val; }
      TreeNode102(int val, TreeNode102 left, TreeNode102 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode102 root) {
        if (root==null)
            return new ArrayList<>();
        List<List<Integer>> Alllevel = new ArrayList<>();
        Queue<TreeNode102> queue  = new ArrayDeque();
        queue.add(root);
        TreeNode102 temp = null;
        while (!queue.isEmpty()){
            int num = queue.size();
            List<Integer> level = new ArrayList<>();
            while (num>0){
                temp = queue.poll();
                level.add(temp.val);
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (root.right!=null){
                    queue.add(temp.right);
                }
                num--;
            }
           Alllevel.add(level);

        }
        return Alllevel;
    }
}
