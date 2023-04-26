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
		WishMessageGenerator wmg2 = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);

		System.out.println(wmg+" available at :"+wmg.hashCode());
		System.out.println(wmg2+" available at :"+wmg2.hashCode());

	}

}
