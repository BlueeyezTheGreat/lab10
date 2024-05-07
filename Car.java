
public class Car extends Vehicle {
	private int numDoors;
	private int numPassangers;
	
	public Car(String aMake, String aModel, String aPlate, int aNumDoors,
				int aNumPassangers) {
		super(aMake, aModel, aPlate);
		this.numDoors = aNumDoors;
		this.numPassangers = aNumPassangers;
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public int getNumPassangers() {
		return this.numPassangers;
	}
	
	@Override
	public String toString() {
		int aNumDoors = this.getNumDoors();
		int aNumPassangers = this.getNumDoors();
		String aMake = this.getMake();
		String aModel = this.getModel();
		String aPlate = this.getPlate();
		
		String temp = aNumDoors + "-door " + aMake + " " + aModel + " with license " + aPlate;
		return temp;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)){
			return false;
		}
		
		Car other = (Car) obj;
		
		if(this.getNumPassangers() == other.getNumPassangers()) {
			if(this.getNumDoors() == other.getNumDoors()) {
				return super.equals(other);
			}
		}
		return false;
	}
	
	public Car copy() {
		int aNumDoors = this.getNumDoors();
		int aNumPassangers = this.getNumDoors();
		String aMake = this.getMake();
		String aModel = this.getModel();
		String aPlate = this.getPlate();
		
		Car copy = new Car(aMake, aModel, aPlate, aNumDoors, aNumPassangers);
		return copy;
	}
	
	
}