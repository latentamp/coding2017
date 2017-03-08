package com.yxm.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 给定ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现？
 */
public class ArrayListDemo {

	public static void main(String[] args) throws Exception, SecurityException {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Class c =array.getClass();
		Method m =c.getMethod("add", Object.class);
		m.invoke(array, "hello");
		System.out.println(array);
	}

}
