package com.yxm.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo5 {

	public static void main(String[] args) throws Exception {
		Class c =Class.forName("com.yxm.reflect.Person");
		Constructor con =c.getDeclaredConstructor();
		con.setAccessible(true);
		Object obj =con.newInstance();
		Method method =c.getDeclaredMethod("show"); 
		method.setAccessible(true);
		method.invoke(obj);
		
		Method method2 =c.getDeclaredMethod("method", String.class);
		method2.invoke(obj, "heh");
	}
	
}
