package dependancyInjection.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	 public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student sakshee = context.getBean("student", Student.class);
		sakshee.displayStudentInfo();
		
		Student sagar = context.getBean("sagar",Student.class);
		sagar.displayStudentInfo();
	}
}
