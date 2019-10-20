package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import x.y.Foo;

public class FooTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		Foo bean = (Foo) factory.getBean("foo");
		
		factory.close();
		//factory.destroy();
		//factory.registerShutdownHook();
	}

}
