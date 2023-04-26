package in.ineuron.bo;

public class CustomerBO {

	private String customerName;
	private String customerAddress;

	private Float pamt;
	private Float rate;
	private Float time;

	private Float interestAmount;

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public void setInterestAmount(Float interestAmount) {
		this.interestAmount = interestAmount;
	}

	
	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public Float getPamt() {
		return pamt;
	}

	public Float getRate() {
		return rate;
	}

	public Float getTime() {
		return time;
	}

	public Float getInterestAmount() {
		return interestAmount;
	}

	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", interestAmount=" + interestAmount + "]";
	}

}
