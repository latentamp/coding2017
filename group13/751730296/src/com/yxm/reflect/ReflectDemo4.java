package com.yxm.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 通过反射获取成员变量并使用
 */
public class ReflectDemo4 {

	public static void main(String[] args) throws Exception {
		Class c =Class.forName("com.yxm.reflect.Person");
//		Field[] fields =c.getDeclaredFields();
//		for(Field field:fields){
//			System.out.println(field);
//		}
		Constructor con =c.getConstructor();
		Object obj = con.newInstance();
		//System.out.println(obj);
		Field addressField =c.getField("address");
		addressField.set(obj, "hefie");
		System.out.println(obj);
		Field nameField =c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "yxm");
		System.out.println(obj);
	}

}
