package in.ineuron.main;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.comp.Student;

public class AdvancedBeanFactoryApp {
	public static void main(String[] args) throws IOException {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("Container Started");
		
		System.in.read();
		
		Student student = (Student) factory.getBean("std1",Student.class);
		System.out.println(student);
		
	}
}
