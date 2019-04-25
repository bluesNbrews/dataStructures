public class GWLinkedList {
	
	//Last value on the stack(top)
	Node top;
	
	//Use TreeNode as the value for the stack Node and Node as the next TreeNode to be popped off the stack
	//Essentially a Linked List with the first value acting as the top of the stack
	public class Node {
		TreeNode value;
		Node next;
		
		//Constructor with TreeNode value set
		Node(TreeNode tn){
			value = tn;
			next = null;
		}
	}
	
	//Start top with null
	public GWLinkedList() {
		top = null;
	}
	
	//Set temp as top, which will be the next Node in the stack. Set top as the new TreeNode that is pushed onto the stack
	public void push(TreeNode tn) {
		Node temp = top;
		top = new Node(tn);
		top.next = temp;
	}
	
	//Return the TreeNode on the top of the stack and set the next Node as the top TreeNode on the stack
	public TreeNode pop() {
		TreeNode v = top.value;
		top = top.next;
		return v;
	}
}
