package com.springcore.lifecycle2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle2/config.xml");
		context.registerShutdownHook();
		Example example=(Example) context.getBean("example");
		System.out.println(example);
	}
}
