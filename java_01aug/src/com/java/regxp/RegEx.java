package com.java.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(".xx.", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("mxxz");

		System.out.println("Input String match :" + matcher.matches()) ;
	}

}
