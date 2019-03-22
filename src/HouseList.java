public class HouseList<T> {
	
	//The first node in the list
	FlexNode<T> head;
	
	public void show() {
		
		//Set the pointer to the first node (head)
		FlexNode<T> currentPointer = head;
		
		//As long as the pointer is not null (no more nodes), print the toString for the node (House object) and set pointer to the next node
		while(currentPointer != null) {
			System.out.println(currentPointer.houseObject + " ");
			currentPointer = currentPointer.next;
		}		
	}
	
	public void remove(int position) {
		
		//Pass in the position to remove (e.g. 0 is first node)
		//If there is no first node, return
		if(head == null)
			return;
		
		//The temp position is set to head so we can use some reference point to change the pointer
		FlexNode<T> temp = head;
		
		//If the first node is to be removed, just set the head to the second node
		if(position == 0) {
			head = temp.next;
		}
		
		//As long as temp is not null (end of the list) and i is 1 less than the position to be removed, shift head to the right (next)
		for(int i = 0; temp!= null && i < position - 1; i++) {
			temp = temp.next;
		}
		//Remove fourth 
		//0 < 2
		//0 - temp was head (0) and now is (1)
		
		//1 < 2
		//1 - temp was (1) and now is (2) or the third
		
		//A catch for null temp or null next for temp (end of list)
		if(temp == null || temp.next == null)
			return;
		
		//Set the next pointer to skip the deleted node 
		//In this example, this exclusively works for removal of second node, also works for all of the rest after the second but needs
		//the for loop above. There's essentially three nodes being looked at - 1) the previous node of the one to be removed 2) node
		//to be removed 3) the node after the node to be removed
		FlexNode<T> next = temp.next.next;
		temp.next = next;
	}
}
