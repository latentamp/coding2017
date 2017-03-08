package com.yxm.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws Exception {
//		Student s = new Student();
//		s.love();
//		Teacher t = new Teacher();
//		t.love();
		Properties pro = new Properties();
		FileReader fr =new FileReader("class.txt");
		pro.load(fr);
		fr.close();
		String className =pro.getProperty("className");
		String methodName =pro.getProperty("methodName");
		Class c =Class.forName(className);
		Constructor con =c.getDeclaredConstructor();
		con.setAccessible(true);
		Object obj =con.newInstance();
		Method method = c.getDeclaredMethod(methodName);
		method.setAccessible(true);
		method.invoke(obj);
	}
}
