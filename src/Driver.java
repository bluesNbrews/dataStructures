public class Driver{

	public static void main(String[] args) {
		
		LinkedList first = new LinkedList();
		
		first.head = new Node("Steven");
		Node second = new Node ("Jack");
		Node third = new Node ("Jill");	
		
		first.head.next = second;
		second.next = third;
		
		first.printList();
	}
}
