package com.git.test;

import org.junit.Test;

public class test {

	@Test
	public void test(){
		
		Cat cat = new Cat();
		cat.name = "小莉";
		cat.age = 18;
		cat.color = "white";
		
		cat.lc.name = "小小莉";
		cat.lc.age = 6;
		cat.lc.color = "red";
		
		System.out.println(cat.toString());
	}
}
 