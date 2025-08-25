class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
        this.right = right;
    }
}
class q2 {
    private TreeNode helper(TreeNode root, int key) {
        if(root==null) {
            return null;
        }

        if(key<root.val) {
            root.left =helper(root.left,key);
        } else if (key>root.val) {
            root.right = helper(root.right,key);
        } else {
            if (root.left == null && root.right==null) {
                return null;
            }
            else if(root.left==null) {
                return root.right;
            }
            else if(root.right==null) {
                return root.left;
            }
            else {
                TreeNode temp =root.right;
                while (temp.left !=null) {
                    temp=temp.left;
                }
                root.val=temp.val;
                root.right=helper(root.right, temp.val);
            }
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return helper(root, key);
    }
    public static void main(String[] args) {
       
    }
}