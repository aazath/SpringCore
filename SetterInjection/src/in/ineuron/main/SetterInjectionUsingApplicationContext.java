package in.ineuron.main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class SetterInjectionUsingApplicationContext {

	public static void main(String[] args) {

		// Activating the IOC container(XmlBeanFactory)
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		// Getting the bean from the container
		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);

		// using the bean
		String message = wmg.generateMessage("Aazath");
		System.out.println(message);		

		// closing the container
		factory.close();
	}

}
