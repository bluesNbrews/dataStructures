public class FlexNode<T> {
		
	//House object is the data and next is the pointer
	T houseObject;
	FlexNode<T> next;
		
	//Pass in the House object to create the node with House
	FlexNode(T houseObject){
		this.houseObject = houseObject;
		next = null;
	}		
}
