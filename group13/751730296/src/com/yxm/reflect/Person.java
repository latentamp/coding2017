package com.yxm.reflect;

public class Person {
	private String name;
	int age;
	public String address;
	public Person(){
	}
	private Person(String name){
		this.name=name;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public Person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void show(){
		System.out.println("show me");
	}
	
	public void method(String s){
		System.out.println("method"+s);
	}
	
	public String getString(String s,int i){
		return s+"---"+i;
	}
	
	private void fuction(){
		System.out.println("fuction me");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
