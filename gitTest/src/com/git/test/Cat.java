package com.git.test;

public class Cat {
	
	String name;     	//姓名
	int age;           //年龄
	String color;      //颜色
	LittleCat lc = new LittleCat();      //小猫的对象
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", lc=" + lc + "]";
	}
}
