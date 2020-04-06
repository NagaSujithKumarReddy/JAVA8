package com.java8;
interface D{  
    public String say(String name);  
}  

public class Singleparameter {
	public static void main(String[] args) {  
	      
         
        D s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sujith"));  
          
            
        D s2= (name) ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sujith"));  
    }  
}  


