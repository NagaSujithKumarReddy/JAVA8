package com.functionalinterface;
interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Savable extends Doable{  
    void say(String msg);   // abstract method  
}  
public class NonFunctionalInterface  implements Savable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  

	public static void main(String[] args) {
		
		NonFunctionalInterface fie = new NonFunctionalInterface();  
	        fie.say("Hello there");  
	        fie.doIt();  
	    }  
	}


