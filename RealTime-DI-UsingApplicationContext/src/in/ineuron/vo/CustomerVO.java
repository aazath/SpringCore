package in.ineuron.vo;

public class CustomerVO {
	private String customerName;
	private String customerAddress;
	private String pamt;
	private String rate;
	private String time;
	
	
	public CustomerVO() {

	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public String getPamt() {
		return pamt;
	}
	public String getRate() {
		return rate;
	}
	public String getTime() {
		return time;
	}
	

	
}
