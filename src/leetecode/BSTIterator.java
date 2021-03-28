package leetecode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 *
 *@description: leetcode 173. 二叉搜索树迭代器
 * 实现一个二叉搜索树迭代器类BSTIterator ，表示一个按中序遍历二叉搜索树（BST）的迭代器：
 * BSTIterator(TreeNode root) 初始化 BSTIterator 类的一个对象。BST 的根节点 root 会作为构造函数的一部分给出。指针应初始化为一个不存在于 BST 中的数字，且该数字小于 BST 中的任何元素。
 * boolean hasNext() 如果向指针右侧遍历存在数字，则返回 true ；否则返回 false 。
 * int next()将指针向右移动，然后返回指针处的数字。
 * 注意，指针初始化为一个不存在于 BST 中的数字，所以对 next() 的首次调用将返回 BST 中的最小元素。
 *
 * 你可以假设 next() 调用总是有效的，也就是说，当调用 next() 时，BST 的中序遍历中至少存在一个下一个数字。
 *
 *  
 *
 * 示例：
 *
 * 
 *@author: zzh
 *@time: 2021/3/28 下午8:00
 * 
 */
 class TreeNode173 {
      int val;
      TreeNode173 left;
      TreeNode173 right;
      TreeNode173() {}
      TreeNode173(int val) { this.val = val; }
      TreeNode173(int val, TreeNode173 left, TreeNode173 right) {
         this.val = val;
         this.left = left;
          this.right = right;
      }
  }
public class BSTIterator {
    Stack<TreeNode173> stack = new Stack<TreeNode173>();
    public BSTIterator(TreeNode173 root) {
        while (root != null) {
            stack.add(root);
            root = root.left;
        }
    }
    public int next(){

            TreeNode173 t = stack.pop();
            int num = t.val;
            t=t.right;
            while (t!=null){
                stack.add(t);
                t = t.left;
            }

        return num;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

