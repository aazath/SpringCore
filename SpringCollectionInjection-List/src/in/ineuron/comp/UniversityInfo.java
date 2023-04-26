package in.ineuron.comp;

import java.util.Date;
import java.util.Map;

public class UniversityInfo {
	private Map<Integer, String> facultyDetails;
	private  Map<String, Date> datesInfo;
	
	
	public UniversityInfo() {
		// TODO Auto-generated constructor stub
	}
	public Map<Integer, String> getFacultyDetails() {
		return facultyDetails;
	}
	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}
	public Map<String, Date> getDatesInfo() {
		return datesInfo;
	}
	public void setDatesInfo(Map<String, Date> datesInfo) {
		this.datesInfo = datesInfo;
	}
	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", datesInfo=" + datesInfo + "]";
	}
	
	
}
