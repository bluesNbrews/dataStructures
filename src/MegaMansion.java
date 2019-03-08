
public class MegaMansion extends LuxuryHouse {
	
	//Adding the solar variable and also the version variable
	int poolHouseRooms;
	int poolHouseBathRooms;
	
	//All variables except solar sent to the House superclass
	public MegaMansion(float sqft, float price, String l, int numBd, int numBt, int numGr, int wineCellar, int poolHouseRooms, int poolHouseBathRooms) {
		super(sqft, price, l, numBd, numBt, numGr, wineCellar);
		this.poolHouseRooms = poolHouseRooms;
		this.poolHouseBathRooms = poolHouseBathRooms;
		}
	//To string to return all of the instance variables in string format
	public String toString() {
		String myString = super.toString() + "This is also considered a megamansion with " + poolHouseRooms + 
		" pool house room(s) and " + poolHouseBathRooms + " pool house bathroom(s).\n";
		return myString;
	}
	
	//Set the amount of pool house rooms
	public void setpoolHouseRooms(int poolHRooms) {
		poolHouseRooms = poolHRooms;
	}
	//Set the amount of pool house bath rooms
	public void poolHouseBathRooms(int poolHBRooms) {
		poolHouseBathRooms = poolHBRooms;
	}
		
	//Get the amount of pool house rooms
	public int poolHouseRooms() {
		return poolHouseRooms;
	}
	
	//Get the amount of pool house bath rooms
	public int poolHouseBathRooms() {
		return poolHouseBathRooms;
	}

}
