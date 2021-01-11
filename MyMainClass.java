package com.raravindec.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyFeedback());
		context.close();
	}

}
