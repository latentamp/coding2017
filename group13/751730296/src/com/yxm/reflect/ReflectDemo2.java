package com.yxm.reflect;

import java.lang.reflect.Constructor;
/*
 * 有参构造
 */
public class ReflectDemo2 {

	public static void main(String[] args) throws Exception {
		Class c =Class.forName("com.yxm.reflect.Person");
		Constructor con =c.getConstructor(String.class,int.class,String.class);
		Object o =	con.newInstance("wang",3,"hefei");
		System.out.println(o);
	}

}
