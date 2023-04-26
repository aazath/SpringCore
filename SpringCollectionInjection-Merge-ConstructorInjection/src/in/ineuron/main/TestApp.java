package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EnggSubjects;

public class TestApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		EnggSubjects enggSubjects = context.getBean("CS", EnggSubjects.class);
		System.out.println(enggSubjects);
		
		EnggSubjects civil = context.getBean("Civil", EnggSubjects.class);
		System.out.println(civil);
		
		((AbstractApplicationContext) context).close();
	}
}
