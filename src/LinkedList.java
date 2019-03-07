public class LinkedList {
	
	Node head;
	
	public void printList() {
		
		Node currentPointer = head;
		
		while(currentPointer != null) {
			System.out.println(currentPointer.firstName + " ");
			currentPointer = currentPointer.next;
		}		
	}
}