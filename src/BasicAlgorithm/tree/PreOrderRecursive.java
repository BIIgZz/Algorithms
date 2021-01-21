package BasicAlgorithm.tree;

/**
 * @program: algorithm
 * @description: 递归先序遍历
 * @author: zzh
 * @create: 2021-01-21 22:33
 **/
public class PreOrderRecursive {
    public  TreeNode preOrderRecursive(TreeNode root){
        if (root == null)
            return root;
        System.out.println(root.getData());
        preOrderRecursive(root.getLeft());
        preOrderRecursive(root.getRight());
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        BinaryTree binaryTree = new BinaryTree(arr,0);
        PreOrderRecursive preOrderRecursive = new PreOrderRecursive();
        preOrderRecursive.preOrderRecursive(binaryTree.root);

    }
}
