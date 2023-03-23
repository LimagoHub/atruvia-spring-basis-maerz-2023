package de.application;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "de")
public class Main {


	public static void main(String[] args) {


		//final AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		context.registerShutdownHook();

	}

}
