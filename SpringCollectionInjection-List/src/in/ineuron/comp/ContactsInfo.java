package in.ineuron.comp;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {
	private Set<Long> phoneNumbers;
	private Set<Date> dates;
	
	
	public ContactsInfo() {
		// TODO Auto-generated constructor stub
	}
	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Set<Date> getDates() {
		return dates;
	}
	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "ContactsInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}
	
	
}
