package com.java.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {

	public static void main(String[] args) {
		
          Pattern pattern = Pattern.compile("xy", Pattern.CASE_INSENSITIVE);
          Matcher matcher = pattern.matcher("XYzwxy");
          
          while(matcher.find()) {
        	  
        	  System.out.println("Found the Text \"" + matcher.group() +"\" Starting At " + matcher.start()+"index and ending at index" + matcher.end());
          }
          
          //Split()
          
         pattern =Pattern.compile("\\W");
         
         String[] fruits = pattern.split("apple@Banana$Cherry#Dates$Kiwi");
         
         for(String fruit : fruits) {
        	 System.out.println("Split using Pattern.split() : " + fruit);
         }
         
         
	}

}
