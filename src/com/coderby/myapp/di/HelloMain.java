package com.coderby.myapp.di;

public class HelloMain {
	
	public static void main(String[] args) {
		IHelloService helloService = new HelloService();
		HelloController controller = new HelloController();
		controller.setHelloService(helloService);
		controller.hello("홍길동");
	}

}
