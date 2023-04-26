package in.ineuron.main;

import java.util.Arrays;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.comp.College;
import in.ineuron.comp.ContactsInfo;
import in.ineuron.comp.MarksInfo;
import in.ineuron.comp.UniversityInfo;

public class TestApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");

		System.out.println("Beans :"+Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println("Container Started");
		MarksInfo info = factory.getBean("marks", MarksInfo.class);
		System.out.println(info);
		
		College clg = factory.getBean("clg",College.class);
		System.out.println(clg);
		
		ContactsInfo contacts = factory.getBean("contact", ContactsInfo.class);
		System.out.println(contacts);
		
		UniversityInfo universityInfo = factory.getBean("university",UniversityInfo.class);
		System.out.println(universityInfo);
	}
}
