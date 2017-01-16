package com.thinkinjava.class2;

import java.util.Random;

public class Test4 {
	//模拟扔硬币
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(2);
		int b = random.nextInt(2);;
		if(a==b){
			System.out.println("正面");
		}else {
			System.out.println("背面");
		}
	}
}
