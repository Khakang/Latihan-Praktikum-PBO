package inheritanceTest;

public class Car extends Vehicle {
	private int numDoors;
	private boolean isElectric;
	
	public Car(int numWheels, int numDoors, boolean isElectric) {
		super(numWheels);
		this.numDoors = numDoors;
		this.isElectric = isElectric;
	}
	public int getNumDoors() {
		return numDoors;
	}
	public boolean getIsElectric() {
		return isElectric;
	}

}
