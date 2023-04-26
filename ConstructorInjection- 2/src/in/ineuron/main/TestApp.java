package in.ineuron.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.Student;

public class TestApp {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");
		XmlBeanFactory factory = new  XmlBeanFactory(resource);
		
		Student std1 = (Student) factory.getBean("std1",Student.class);
		System.out.println(std1);
		Student std2 = (Student) factory.getBean("std2",Student.class);
		System.out.println(std2);
		Student std3 = (Student) factory.getBean("std3",Student.class);
		System.out.println(std3);
		
	}

}
