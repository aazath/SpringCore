package in.ineuron.comp;

public class Car {
	private String model;
	private Integer cylinderCapacity;
	private String regNo;
	private String fuelType;
	private String manufacturer;
	private String colour;
	private String owner;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCylinderCapacity(Integer cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", cylinderCapacity=" + cylinderCapacity + ", regNo=" + regNo + ", fuelType="
				+ fuelType + ", manufacturer=" + manufacturer + ", colour=" + colour + ", owner=" + owner + "]";
	}
	
	
	
}
