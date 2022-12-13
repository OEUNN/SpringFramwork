package com.coderby.myapp.di;

public class HelloController {
	
	//객체를 저장할 수 있도록 인터페이스로 선언만 함
	IHelloService helloService;
	
	/*
	//필요한 객체를 전달받을 수 있도록 생성자 추가
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	
	//필요한 객체를 전달받을 수 있도록 set 메서드 추가
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	public void hello(String name) {
		System.out.println("HelloController :"+helloService.sayHello(name));
	}
}
