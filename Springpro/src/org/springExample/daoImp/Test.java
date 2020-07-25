package org.springExample.daoImp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Application.xml");
		Collage1 clg=(Collage1) context.getBean("collage");
		
		System.out.print(clg);

	}

}
