package org.tnsif.acc.c2tc.InterviewQuestions;

public class stringpalindrome {

	public static void main(String[] args) {
        String num = "malayalam";
        String Rev="";
    	for(int i=num.length()-1;i>=0;i--) {
    		Rev+=num.charAt(i);
    	}
    	if(num.equals(Rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

