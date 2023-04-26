package in.ineuron.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		
		//Activating the IOC container(XmlBeanFactory)
		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		//Getting the  bean from the container
		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg", WishMessageGenerator.class);
		
		//using the bean
		String message = wmg.generateMessage("Aazath");
		System.out.println(message);
		
		//closing the  container
	}

}
