public class House {
	//6 total instance variables for House
	private float sqft, price;
	private String location;
	private int numBath, numBd, numGarage;
	
	//House constructor, uses all 6 instance variables
	public House(float sqft, float price, String l, int numBd, int numBt, int numGr) {
		this.sqft = sqft;
		this.price = price;
		location = l;
		this.numBd = numBd;
		this.numBath = numBt;
		this.numGarage = numGr;
	}
	//To string to return all of the instance variables together
	public String toString() {
		String myString = "This house is located at " + location + " with the following square feet: " + sqft +
		".\nThere are " + numBd + " bedrooms and " + numBath + " bathrooms." + " Lastly there is " + numGarage +
		" garage(s) for a total price of $" + price + ".\n";
		return myString;
	}
	
	//Set location
	public void setLocation(String l) {
		location = l;
	}
	//Set bedrooms
	public void setBedrooms(int numBed) {
		numBd = numBed;
	}
	//Set bathrooms
	public void setBathrooms(int numBt) {
		numBath = numBt;
	}
	//Set garages
	public void setGarages(int numGr) {
		numGarage = numGr;
	}
	//Get location
	public String getLocation() {
		return location;
	}
	//Get bedrooms
	public int getBedrooms() {
		return numBd;
	}
	//Get bathrooms
	public int getBathrooms() {
		return numBath;
	}
	//Get garages
	public int getGarages() {
		return numGarage;
	}
}
