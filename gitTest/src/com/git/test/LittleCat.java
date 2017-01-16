package com.git.test;

public class LittleCat {

	String name;     	//姓名
	int age;           //年龄
	String color;      //颜色
	
	@Override
	public String toString() {
		return "LittleCat [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	//叫的动作
	public void call(){
		System.out.println("叫");
	}
	//跳的动作
	public void jump(){
		System.out.println("叫");
	}
}
