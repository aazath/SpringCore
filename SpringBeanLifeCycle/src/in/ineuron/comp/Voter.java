package in.ineuron.comp;

import java.util.Date;
import java.util.FormatFlagsConversionMismatchException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "in/ineuron/commons/application.properties")
public class Voter {
	@Value("${voter.info.name}")
	private String name;
	@Value("${voter.info.age}")
	private Integer age;

	private Date dov;

	public Voter() {
		System.out.println("Voter.Voter()");
	}

	public void myInit() {
		System.out.println("Voter.myInit()");
		dov = new Date();
		boolean flag = false;

		if (age == null)
			flag = true;
		if (age < 0)
			age = age * -1;
		if (age > 100) {
			System.out.println("Age must not be greater than 100");
			flag = true;
		}
		if (flag)
			throw new IllegalArgumentException("Invalid inputs...");
	}

	public String checkingVotingEligibility() {
		if (age >= 18)
			return "Mr/Miss/Mrs: " + name + " u r eligibile for voting: " + age + " ---> on " + dov;
		else
			return "Mr/Miss/Mrs: " + name + " u r not eligibile for voting: " + age + "---> on " + dov;
	}

	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		name = null;
		age = 0;
		dov = null;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}

}
