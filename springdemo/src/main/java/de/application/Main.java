package de.application;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {



	public static void main(String[] args) {


		final ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");




	}

}
