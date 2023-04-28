package in.ineuron.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.controller.MainController;
import in.ineuron.vo.EmployeeVO;

public class TestApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter  the  Employee Name :");
		String ename = scanner.next();
		
		System.out.println("Enter  the  Employee Age :");
		String eage = scanner.next();
		
		System.out.println("Enter  the  Employee Address :");
		String eaddress = scanner.next();
		
		System.out.println("Enter  the  Employee Salary :");
		String esalary = scanner.next();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MainController controller = context.getBean(MainController.class);
		
		EmployeeVO vo = new EmployeeVO();
		vo.setEname(ename);
		vo.setEage(eage);
		vo.setEadress(eaddress);
		vo.setEsalary(esalary);
		EmployeeVO vo2 = controller.getHike(vo);
		System.out.println(vo2);
		
		((AbstractApplicationContext) context).close();
		scanner.close();
	}
}
