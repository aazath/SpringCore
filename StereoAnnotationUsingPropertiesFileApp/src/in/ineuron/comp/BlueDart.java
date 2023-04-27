package in.ineuron.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "bDart")
@Primary
public class BlueDart implements ICourier {

	static {
		System.out.println("BlueDart.class file is loading");
	}
	
	public BlueDart() {
		System.out.println("BlueDart : Zero parameterized constructor");
	}
	public String deliver(int oid) {
		return "BlueDart will deliver your order : Order ID :"+oid;
	}

}
