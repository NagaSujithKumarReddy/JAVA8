package com.java8;
interface C{  
    public String say();  
}  
public class Noparameter {

	public static void main(String[] args) {
		C s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());

	}

}
