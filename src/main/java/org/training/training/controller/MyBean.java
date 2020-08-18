package org.training.training.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

public class MyBean {
	private int i = 25;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
