package com.training.example.JacocoExample;

public class Palindrome {
	
	public boolean isPalindrome(String inputString) {
	    if (inputString.length() == 0) {
			System.out.println("No string provided");
	        return true;
	    } else {
	    	String rev = "";
	    	int length = inputString.length();
	    	 
	        for ( int i = length - 1; i >= 0; i-- )
	           rev = rev + inputString.charAt(i);

	        if (inputString.equals(rev)) {
				System.out.println("String is a Palindrome");
				return true;
			}
	        else {
				System.out.println("String is not a Palindrome");
				return false;
			}
	    }
	}

}
