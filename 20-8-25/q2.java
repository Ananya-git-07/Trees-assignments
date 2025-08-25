
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { 
        this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class q2 {
    public boolean checkTree(TreeNode root) {
        if(root.val==root.left.val+root.right.val){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       
    }
}
