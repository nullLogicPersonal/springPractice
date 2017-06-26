package com.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.service.HumanService;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HumanService hs = context.getBean("humanService", HumanService.class);
		System.out.println(hs.ReturnAllHumanCharacteristics().get(0).getGender());

	}

}
