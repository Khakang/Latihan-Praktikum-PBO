package inheritanceTest;

public class Convertible extends Car {
	private String roofType;
	
	public Convertible(int numWheels, int numDoors, boolean isElectric, String roofType) {
		super(numWheels, numDoors, isElectric);
		this.roofType = roofType;
	}
	
	public String getRoofType() {
		return roofType;
	}


}
