package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
@Scope(scopeName = "singleton")
public class WishMessageGenerator {
	
	@Autowired(required = true)
	private LocalDateTime time;
	
	public String generateWishMessage(String name) {
		int hour  =  time.getHour();
		if(hour<12)
			return "Good Morning "+name;
		else if(hour < 16)
			return "Good afternoon " + name;
		else if(hour > 20) {
			return "Good Evening "+name;
		}
		else {
			return "Good night "+name;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [Time is :=" + time + "]";
	}
	
	
	
	
}
