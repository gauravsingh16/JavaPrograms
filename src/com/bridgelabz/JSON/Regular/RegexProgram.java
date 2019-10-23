package com.bridgelabz.JSON.Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProgram {
	
	 
	public static void main(String[] args) {
		String need = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
//................USING PATTERN & MATCHER FUNCTION........................... 
		Pattern pattern=Pattern.compile("");
		
		Matcher matcher=pattern.matcher(need);
		
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}
		Pattern replace=Pattern.compile("Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.");
//..................USING REPLACE FUNCTION...................................		
		Matcher match=replace.matcher(need);
		System.out.println(match.replaceAll("Hello Gaurav, We have your full name as Gaurav Singh in our system. your contact number is 91-8447260570. Please,let us know in case of any clarification Thank you BridgeLabz 06/08/2019."));
		
	}

}
