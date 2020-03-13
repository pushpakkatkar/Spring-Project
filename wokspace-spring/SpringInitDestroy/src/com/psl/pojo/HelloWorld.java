package com.psl.pojo;

public class HelloWorld {

	public HelloWorld()
	{
		System.out.println("Constructor");
	}
	public String sayHello()
	{
		return "Hello world";
	}
	public void init()
	{
		System.out.println("call to init");
	}
	public void destroy()
	{
		System.out.println("Call to destroy");
	}
}
