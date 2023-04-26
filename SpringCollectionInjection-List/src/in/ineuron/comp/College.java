package in.ineuron.comp;

import java.util.Date;
import java.util.List;

public class College {
	private List<String> studName;
	private  List<Date> dateList;
	
	
	public College() {
		// TODO Auto-generated constructor stub
	}
	public List<String> getStudName() {
		return studName;
	}
	public void setStudName(List<String> studName) {
		this.studName = studName;
	}
	public List<Date> getDateList() {
		return dateList;
	}
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}
	@Override
	public String toString() {
		return "College [studName=" + studName + ", dateList=" + dateList + "]";
	}
	
	
}
