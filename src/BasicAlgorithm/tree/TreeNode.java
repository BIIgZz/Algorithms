package BasicAlgorithm.tree;

/**
 * @program: algorithm
 * @description:  树节点
 * @author: zzh
 * @create: 2021-01-21 21:09
 **/
public class TreeNode<T> {
    private T data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
