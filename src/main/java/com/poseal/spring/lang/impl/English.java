package com.poseal.spring.lang.impl;

import com.poseal.spring.lang.Language;

public class English implements Language{

	@Override
	public String getGreeting() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye bye";
	}

}
