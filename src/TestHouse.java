public class TestHouse {

	public static void main(String[] args) {
		//Instantiating the classes
		House markHouse = new House(1800, 275000, "Sarasota", 3, 2, 1);
		LuxuryHouse stevenHouse = new LuxuryHouse(2700, 450000, "Arlington", 4, 2, 1, 1);
		MegaMansion emilyHouse = new MegaMansion(5000, 400000, "San Antonio", 5, 4, 2, 1, 1, 1);
		House chrisHouse = new House(2500, 500000, "Los Angeles", 3, 2, 1);
		LuxuryHouse davidHouse = new LuxuryHouse(1500, 225000, "Orlando", 2, 2, 1, 1);
		MegaMansion nikkiHouse = new MegaMansion(6000, 800000, "Lakewood Ranch", 5, 5, 3, 1, 2, 2);
		House lilyHouse = new House(1500, 175000, "Wilmington", 1, 2, 1);
		LuxuryHouse katherineHouse = new LuxuryHouse(3500, 450000, "Charlotte", 3, 3, 1, 2);
		MegaMansion kimHouse = new MegaMansion(10000, 1000000, "Hawaii", 7, 6, 4, 1, 2, 2);
		House paulHouse = new House(250, 75000, "The Woods", 1, 1, 0);
		
		//Populating a 'House' array with the objects above
		House[] myHouseArray = new House[10];
		myHouseArray[0] = markHouse;
		myHouseArray[1] = stevenHouse;
		myHouseArray[2] = emilyHouse;
		myHouseArray[3] = chrisHouse;
		myHouseArray[4] = davidHouse;
		myHouseArray[5] = nikkiHouse;
		myHouseArray[6] = lilyHouse;
		myHouseArray[7] = katherineHouse;
		myHouseArray[8] = kimHouse;
		myHouseArray[9] = paulHouse;
		
		//Printing out the 'House' array
		for(int i = 0; i < myHouseArray.length; i++) {
			System.out.println(myHouseArray[i]);
			if (myHouseArray[i] instanceof House) {
				//System.out.println("This is an instance of House.\n");
			}
		}
	}
}
