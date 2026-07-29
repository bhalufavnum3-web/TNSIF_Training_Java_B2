package org.tnsif.acc.c2tc.InterviewQuestions;

public class reversestring {

	public static void main(String[] args) {
	String str="bhalu";
	String Revstr="";
	for(int i=str.length()-1;i>=0;i--) {
		Revstr+=str.charAt(i);
	}
	System.out.println("original string :" +str);
	System.out.println("reversed string :"+Revstr);
	}

}
