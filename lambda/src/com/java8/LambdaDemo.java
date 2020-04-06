package com.java8;

interface A
{
	void show();
}
public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
		obj = () ->System.out.println("Hello");
				
						
				
				obj.show();

	}

}
