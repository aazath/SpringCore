package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.comp.WishMessageGenerator;
import in.ineuron.config.AppConfig;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wishMessageGenerator = context.getBean(WishMessageGenerator.class);
		String wishMessage = wishMessageGenerator.generateWishMessage("Aazath");
		System.out.println(wishMessage);
	}
}
