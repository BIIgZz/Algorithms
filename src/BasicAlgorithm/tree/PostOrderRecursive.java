package BasicAlgorithm.tree;

/**
 * @program: algorithm
 * @description: 递归后序遍历
 * @author: zzh
 * @create: 2021-01-21 22:43
 **/
public class PostOrderRecursive {
    public TreeNode postOrderRecursive(TreeNode root){
        if (root == null){
            return root;
        }
        postOrderRecursive(root.getLeft());
        postOrderRecursive(root.getRight());
        System.out.println(root.getData());
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        BinaryTree binaryTree = new BinaryTree(arr,0);
        PostOrderRecursive postOrderRecursive = new PostOrderRecursive();
        postOrderRecursive.postOrderRecursive(binaryTree.root);

    }
}
