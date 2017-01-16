package com.thinkinjava.class2;

public class Test3 {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		dog.name = "spot";
		dog.says = "Ruff!";
		dog3.name = "spot";
		dog3.says = "Ruff!";
		dog2.name = "scruffy";
		dog2.says = "Wurf";
		System.out.println(dog.toString());
		System.out.println(dog2.toString());
		System.out.println(dog.equals(dog3));
	}
}
