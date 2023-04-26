package in.ineuron.comp;

import java.util.Set;

public class EnggSubjects {
	private Set<String> subjects;

	public EnggSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EnggSubjects [subjects=" + subjects + "]";
	}

}
