
package in.ineuron.comp;
public class Student {
	private Integer sno;
	private String sname;
	private String saddress;
	private Float average;
	
	

	public Student(Integer sno, String sname, String saddress, Float average) {
		this.sno = sno;
		this.sname = sname;
		this.saddress = saddress;
		this.average = average;
	}



	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddress=" + saddress + ", average=" + average + "]";
	}
	
	
	
	
	
}
