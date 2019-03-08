
public class LuxuryHouse extends House {
	
	//Adding the solar variable and also the version variable
	final static String version = "0.1beta";
	int wineCellars;
	
	//All variables except solar sent to the House superclass
	public LuxuryHouse(float sqft, float price, String l, int numBd, int numBt, int numGr, int wineCellars) {
		super(sqft, price, l, numBd, numBt, numGr);
		this.wineCellars = wineCellars;
	}
	
	//To string to return all the instance variable in string format
	public String toString() {
		String myString = super.toString() + "This is a luxury home with " + wineCellars + 
		" wine cellar(s).\n";
		return myString;
	}
	
	//Set the amount of wine cellars
	public void setWineCellars(int wineC) {
		wineCellars = wineC;
	}
	
	//Get the amount of wine cellars
	public int getWineCellars() {
		return wineCellars;
	}
}
