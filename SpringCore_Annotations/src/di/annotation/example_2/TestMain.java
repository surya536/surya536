package di.annotation.example_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// Get bean object
		
		
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee);

	}

}
