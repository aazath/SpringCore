package in.ineuron.comp;

public class FirstFlight implements ICourier {

	static {
		System.out.println("FirstFlight.class file is loading");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight : Zero parameterized constructor");
	}
	public String deliver(int oid) {
		return "FirstFlight will deliver your order : Order ID :"+oid;

	}

}
