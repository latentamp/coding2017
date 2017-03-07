package com.yxm.reflect;

import java.lang.reflect.Constructor;
/*
 * 通过反射获取构造方法并使用
 * 无参构造
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception{
		Person p =new Person();
		//Class c=p.getClass();
		//Class c=Person.class;
		Class c=Class.forName("com.yxm.reflect.Person");
		//Constructor[] cons =c.getConstructors();
//		Constructor[] cons =c.getDeclaredConstructors();
//		for(Constructor con:cons){
//			System.out.println(con);
//		}
		Constructor con =c.getConstructor();
		Object o = con.newInstance();
		System.out.println(o);
		
	}
}
