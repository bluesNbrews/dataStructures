public class TestNode {

	public static void main(String[] args) {
		
		//Create a new LinkedList object from generic class 
		HouseList<House> first = new HouseList<House>();
		
		//Using the House, LuxuryHouse, and MegaMansion objects (6 of the 10) created in the last assignment
		House markHouse = new House(1800, 275000, "Sarasota", 3, 2, 1);
		LuxuryHouse stevenHouse = new LuxuryHouse(2700, 450000, "Arlington", 4, 2, 1, 1);
		MegaMansion emilyHouse = new MegaMansion(5000, 400000, "San Antonio", 5, 4, 2, 1, 1, 1);
		House chrisHouse = new House(2500, 500000, "Los Angeles", 3, 2, 1);
		LuxuryHouse davidHouse = new LuxuryHouse(1500, 225000, "Orlando", 2, 2, 1, 1);
		MegaMansion nikkiHouse = new MegaMansion(6000, 800000, "Lakewood Ranch", 5, 5, 3, 1, 2, 2);
		
		//Create the first, second, and third nodes (generic) using the objects created 
		first.head = new FlexNode<>(markHouse);
		FlexNode<House> second = new FlexNode<> (stevenHouse);
		FlexNode<House> third = new FlexNode<> (emilyHouse);
		FlexNode<House> fourth = new FlexNode<>(chrisHouse);
		FlexNode<House> fifth = new FlexNode<> (davidHouse);
		FlexNode<House> sixth = new FlexNode<> (nikkiHouse);
		
		//Point the first to the second and the second to the third
		first.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		//Use the remove method to remove n node. In this example, the fourth node or 3 (0,1,2,3)
		first.remove(3);
		
		//Use the show method to print the nodes
		first.show();
	}
}
