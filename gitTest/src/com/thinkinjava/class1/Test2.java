package com.thinkinjava.class1;

public class Test2 {

	public static void main(String[] args) {
		TestStatic static1 = new TestStatic();
		TestStatic static2 = new TestStatic();
		static1.i=2;
		static1.j=2;
		System.out.println(static1.i+" "+static2.i+" "+TestStatic.i);
		System.out.println(static1.j+" "+static2.j);
		TestStatic.a();
	}

}
