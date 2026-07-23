package org.tnsif.acc.c2tc.oops;

public class human {
	
	private String name;
	private int age;
	
	public void setName(String name) {
	this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	

	public static void main(String[] args) {
		human obj=new human();
		obj.name="balaji";
		obj.age=21;
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.name="hemanth";
		obj.age=22;
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}

}
