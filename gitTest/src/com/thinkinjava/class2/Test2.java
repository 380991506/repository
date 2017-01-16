package com.thinkinjava.class2;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		/*Random random = new Random();
		for (int i = 0; i < 20; i++) {
			System.out.println(random.nextInt(100));
		}*/
	/*	int i = 6;
		int j = 4;
		System.out.println(i %= j);*/
		Random dom = new Random(47);
		float  s = dom.nextFloat()*1000;
		float h = (dom.nextFloat()+0.1f)*10;
		System.out.println(s/h);
	}
}
