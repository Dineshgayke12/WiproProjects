package com.java.string;

public class MyStringBuffer {

	public static void main(String[] args) {
		
		
		String name= "Dinesh gayke";
		String name1 = "Dinesh Gayke";
		
		StringBuilder string = new StringBuilder(name);
		System.out.println("Reversed name :" + string.reverse());
		System.out.println("Is Empty value is : " + string.isEmpty());
		
		StringBuffer buffer =new StringBuffer(name);
		buffer.replace(0, 5, " Gayke");
		
		System.out.println(buffer);
		System.out.println(buffer.hashCode());
		System.out.println(buffer.equals(name1));
		System.out.println(name.toLowerCase());
		
		
		
		
		
		
		
	/*	String name="Dinesh Gayke";
		
        	StringBuffer sbuffer = new StringBuffer("Hello");
		
	    	sbuffer.append("world. welcome to the world of java");
	 	
    	    sbuffer.insert(37, " mighty");
		
	     	buffer.reverse();
		
		
		
	       sbuffer.replace(7, 12, "EveryOne");
	
	       sbuffer.toString();
		
		  sbuffer.subSequence(0, 5);
		
          int i=	sbuffer.indexOf("Dinesh",5);
		
	      System.out.println(1);
		
	     System.out.println(sbuffer + "len :" + sbuffer.length() + "\ncapacity:" + sbuffer.capacity() );*/
		
		

	}

}
