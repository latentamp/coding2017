package com.yxm.reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {
		Class c =Class.forName("com.yxm.reflect.Person");
		Constructor	con =c.getDeclaredConstructor(String.class);
		con.setAccessible(true);//值为true则指示反射的对象在使用时应该取消Java语言访问检查
		Object o = con.newInstance("yxm");
		System.out.println(o);
	}

}
