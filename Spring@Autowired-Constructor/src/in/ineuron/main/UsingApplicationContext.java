package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipcart;

public class UsingApplicationContext {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");

		System.out.println("Container Started");

		Flipcart fkart = factory.getBean(Flipcart.class);
		System.out.println(fkart);
		String results = fkart.doShopping(new String[] { "Tissot", "Titan" }, new float[] { 35007.45f, 71000.0f });
		System.out.println(results);

		((AbstractApplicationContext) factory).close();
	}
}
