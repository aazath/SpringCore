package in.ineuron.comp;

import java.util.Arrays;

public class MarksInfo {

	private int[] marksInfo;

	public MarksInfo() {
		// TODO Auto-generated constructor stub
	}

	public int[] getMarksInfo() {
		return marksInfo;
	}

	public void setMarksInfo(int[] marksInfo) {
		this.marksInfo = marksInfo;
	}

	public MarksInfo(int[] marksInfo) {
		this.marksInfo = marksInfo;
	}

	@Override
	public String toString() {
		return "MarksInfo [marksInfo=" + Arrays.toString(marksInfo) + "]";
	}
}
