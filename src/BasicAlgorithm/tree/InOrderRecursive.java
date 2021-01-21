package BasicAlgorithm.tree;

/**
 * @program: algorithm
 * @description: 递归中序遍历
 * @author: zzh
 * @create: 2021-01-21 22:16
 **/
public class InOrderRecursive {
    public TreeNode inOrderRecursive(TreeNode root){
        if (root == null )
            return  root;
        //递归遍历左子树
        inOrderRecursive(root.getLeft());
        //输出
        System.out.println(root.getData());
        //递归遍历右子树
        inOrderRecursive(root.getRight());

        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        BinaryTree binaryTree = new BinaryTree(arr,0);
        InOrderRecursive inOrderRecursive = new InOrderRecursive();
        inOrderRecursive.inOrderRecursive(binaryTree.root);
    }
}
