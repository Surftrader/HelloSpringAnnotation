package com.poseal.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.poseal.spring.lang.Language;
import com.poseal.spring.lang.impl.Vietnamese;

@Component
@ComponentScan({"com.poseal.spring.bean"})
public class AppConfiguration {
	
	@Bean(name="language")
	public Language getLanguage() {
		return new Vietnamese();
		//return new English();
	}
}
