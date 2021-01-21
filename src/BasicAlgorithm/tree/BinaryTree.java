package BasicAlgorithm.tree;

/**
 * @program: algorithm
 * @description: 创建满二叉树或者完全二叉树
 * @author: zzh
 * @create: 2021-01-21 21:07
 **/

public class BinaryTree {
    public TreeNode root = null;
    public BinaryTree(int[] arr, int index) {
        root = createTree(arr,index);

    }

    public TreeNode createTree(int arr[], int index){
        TreeNode<Integer> treeNode = null;
        if (index < arr.length){
            treeNode = new TreeNode<>(arr[index]);
            treeNode.setLeft(createTree(arr, index*2+1));
            treeNode.setRight(createTree(arr,index*2+2));
        }
        return  treeNode;
    }

}
