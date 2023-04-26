package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Target object
public class Flipcart {

	private ICourier courier;
	private Float discount;

	public Flipcart() {

	}

	@Autowired
	public void setCourier(@Qualifier("fFlight") ICourier courier) {
		this.courier = courier;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	// Business logic
	public String doShopping(String[] items, float[] prices) {
		System.out.println("Discount Rate :" + discount);

		float billAmount = 0.0f;
		Random random = null;
		int oid = 0;
		for (float price : prices) {
			billAmount += (price - (price * discount / 100.0f));
		}
		random = new Random();
		oid = random.nextInt(10000);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " Purchased having prices " + Arrays.toString(prices)
				+ "\nTotal after discount :" + billAmount + "\n" + msg;
	}

	public String toString() {
		return "Flipcart [courier=" + courier + ", discount=" + discount + "]";
	}

}
