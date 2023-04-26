package in.ineuron.comp;

import java.util.Date;

public class WishMessageGenerator {

	// Target component
	private Date date;

	

	public WishMessageGenerator(Date date) {
		this.date = date;
	}


	public Date getDate() {
		System.out.println("Setter method called to perform injection");
		return date;
	}

	
	public String generateMessage(String username) {
		int hour = date.getHours();
		
		if (hour <12) {
			return "Good Morning " + username;
		} else if (hour<16) {
			return "Good afternoon "+username;
		}else if (hour<20) {
			return "Good Evening "+username;
		}else {
			return "Good Night "+username;
		}
	}
}
