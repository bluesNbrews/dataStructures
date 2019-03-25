
public class Tree{

	//Create the root of the Binary Tree using TreeNode
	TreeNode root;
		
	//Pass root to next function since root cannot be given as a parameter from DriverDFS
	public void DFS() {
		iteratePreOrderDFS(root);
	}
	
	//Function call from DFS above
	public void iteratePreOrderDFS(TreeNode node) {

		//Create the stack and add the root (push)
		GWLinkedList stack = new GWLinkedList();
		stack.push(node);
		
		//Manually loop (traverse) through the stack. Why not, since I manually added the TreeNodes anyway
		int i = 1;
		while(i <= 9) {
			
			//Keep track of the current TreeNode we are at in the Depth First Traversal and print to console
			TreeNode current = stack.pop();
			System.out.println("Node " + i + " traversed is: " + current.data);
			
			//Add to the stack in a "preorder" fashion. Push the right children first since we want to the left children to pop as we traverse
			if(current.right != null) {
				stack.push(current.right);
			}
			if(current.left != null) {
				stack.push(current.left);
			}
			
			//Increment to traverse
			i++;
		}
	}
}
