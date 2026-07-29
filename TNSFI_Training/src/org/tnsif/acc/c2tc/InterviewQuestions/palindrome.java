package org.tnsif.acc.c2tc.InterviewQuestions;

public class palindrome {

	    public static void main(String[] args) {
	        int num = 12321;
	        int reverse = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num = num / 10;
	        }

	        if (num == reverse)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
	}
