package org.tnsif.acc.c2tc;

public class Variable {
	int price=10;
	void print()
	{
		String msg ="hello";
		System.out.println("msg");
	}
	static String message="hello students";
	
	public static void main(String [] args)
	{
		Variable obj=new Variable();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
		
	}

}