package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value = "dtdc")
public class DTDC implements ICourier {

	static {
		System.out.println("DTDC.class file is loading");
	}
	
	public DTDC() {
		System.out.println("DTDC : Zero parameterized constructor");
	}

	public String deliver(int oid) {
		return "DTDC will deliver your order : Order ID :"+oid;
	}

}
