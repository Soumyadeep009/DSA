import java.util.LinkedList;
import java.util.Queue;

public class ValidBST {

	public static void main(String[] args) {
		//Test
		// TODO Auto-generated method stub
		ValidBST bst=new ValidBST();
		ValidBST.TreeNode node = bst.new TreeNode(5);
		node.left= bst.new TreeNode(1);
		node.right=bst.new TreeNode(4);
		node.right.left=bst.new TreeNode(3);
		node.right.right=bst.new TreeNode(6);
		
		
		System.out.println(isValidBST(node));
	}
	
	
	  public class TreeNode {
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
	
	public static boolean isValidBST(TreeNode root) {
        if(root != null){
            TreeNode currentNode=root;
            Queue<TreeNode> queue= new LinkedList<TreeNode>();
            queue.add(currentNode);
            while(queue.size() > 0){
               currentNode = queue.peek();
               queue.remove();
               if(currentNode.left !=null){
            	   queue.add(currentNode.left);  
               }
               if(currentNode.right !=null){
            	   queue.add(currentNode.right); 
               }
               if(currentNode.left !=null && currentNode.val <= currentNode.left.val ){
            	   return false;
               }
               if(currentNode.right !=null && currentNode.val >= currentNode.right.val ){
            	   return false;
               }
            }
            return true;
        }else{
            return true;
        }
    }

}
