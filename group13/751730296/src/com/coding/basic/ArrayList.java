package com.coding.basic; 
  
public class ArrayList implements List {
	
	private int size = 0;
	
	private Object[] elementData = new Object[100];
	//elementData数组扩容
	public Object[] dilatation(Object[] elementData){
		Object[] dilatationArray = new Object[elementData.length*3/2+1];
		System.arraycopy(elementData, 0, dilatationArray, 0, size);//这里size能否替换为elementData.length？
		elementData=dilatation(elementData);
		return elementData;
	}
	/**
	 * 添加一个元素：
	 * 1、如果当前数组的size小于等于当前数组length的一半，则直接添加该元素到数组的末尾
	 * 2、反之先扩容，再增加元素
	 */
	
	public void add(Object o){
		if(size<=elementData.length/2){
			elementData[size]=o;
		}else{
			dilatation(elementData);
			elementData[size]=o;
		}
	}
	public void add(int index, Object o){
		if (index > size || index < 0)  
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		dilatation(elementData);
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = o;
	}
	
	public Object get(int index){
		return elementData[index];
	}
	
	public Object remove(int index){
		if (index > size || index < 0)  
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		System.arraycopy(elementData, index+1, elementData, index,size - index-1 );
		return elementData[index];
	}
	
	public int size(){
		return size;
	}
	
	public Iterator iterator(){
		return null;
	}
	
}
