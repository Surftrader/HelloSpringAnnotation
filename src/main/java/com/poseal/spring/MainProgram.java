package com.poseal.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.poseal.spring.bean.GreetingService;
import com.poseal.spring.bean.MyComponent;
import com.poseal.spring.config.AppConfiguration;
import com.poseal.spring.lang.Language;

public class MainProgram {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		System.out.println("----------");
		Language language = (Language) context.getBean("language");
		
		System.out.println("Bean Language: " + language);
		System.out.println("Call Language.sayBye(): " + language.getBye());
		
		System.out.println("----------");
		GreetingService service = (GreetingService) context.getBean("greetingService");
		
		service.sayGreeting();
		
		System.out.println("----------");
		MyComponent myComponent = (MyComponent)context.getBean("myComponent");
		
		myComponent.showAppInfo();
	}
}
