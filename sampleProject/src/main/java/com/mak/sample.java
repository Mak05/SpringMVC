package com.mak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class sample {
	public static void main(String[] args) {
	      ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	   }
}
