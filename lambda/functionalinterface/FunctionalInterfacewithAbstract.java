package com.functionalinterface;
@FunctionalInterface  
interface save {  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
public class FunctionalInterfacewithAbstract implements save{  
    public void say(String msg){  
        System.out.println(msg);  
    }  

	public static void main(String[] args) {
		FunctionalInterfacewithAbstract fie = new FunctionalInterfacewithAbstract();  
	        fie.say("Hello there");

	}

}
