package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EnggSubjects;

public class TestApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");

		
		((AbstractApplicationContext) context).close();
	}
}
