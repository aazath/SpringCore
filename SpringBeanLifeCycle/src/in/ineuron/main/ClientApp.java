package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Voter;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		Voter voter = context.getBean(Voter.class);
		System.out.println(voter.checkingVotingEligibility());
		
		((AbstractApplicationContext) context).close();
	}
}
