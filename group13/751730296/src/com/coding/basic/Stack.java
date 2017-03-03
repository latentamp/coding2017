package com.coding.basic;
//先入后出，后入先出
public class Stack {
	private ArrayList elementData = new ArrayList();
	//将数据入栈.
	public void push(Object o){
		elementData.add(o);
	}
	//移除堆栈顶部的对象，并作为此函数的值返回该对象
	public Object pop(){
		
		return elementData.remove(elementData.size()-1);
	}
	//查看堆栈顶部的对象，但不从堆栈中移除它。
	public Object peek(){
		return elementData.get(elementData.size()-1);
	}
	//测试堆栈是否为空。
	public boolean isEmpty(){
		return elementData.size()==0;
	}
	
	public int size(){
		return elementData.size();
	}
}
