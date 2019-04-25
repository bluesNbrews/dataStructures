
public class DriverDFS{

	public static void main(String[] args) {
		
		//Create the root node and populate the Binary Tree with the values 1-9
		//See visual representation of the tree below
		//I did it manually for now but I'm sure there could be a more dynamic way to do populate the Binary Tree
		Tree myTree = new Tree();
		myTree.root = new TreeNode(1);
		myTree.root.left = new TreeNode(2);
		myTree.root.right = new TreeNode(3);
		myTree.root.left.left = new TreeNode(4);
		myTree.root.left.right = new TreeNode(5);
		myTree.root.right.left = new TreeNode(6);
		myTree.root.right.right = new TreeNode(7);
		myTree.root.left.left.left = new TreeNode(8);
		myTree.root.left.left.right = new TreeNode(9);
		
		//Kick off the workflow for Depth First Traversal. See the Tree class
		myTree.DFS();
		
		/* 			 1
		 * 		    /  \
		 *        2      3
		 *       / \    / \
		 *      4   5  6   7
		 *     /\
		 *    8  9
		 */
	}
}
