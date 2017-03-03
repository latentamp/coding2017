package com.coding.basic;
/*
 * 队列是一种特殊的线性表，是一种先进先出（FIFO）的数据结构。
 * 它只允许在表的前端（front）进行删除操作，而在表的后端（rear）进行插入操作。
 * 进行插入操作的端称为队尾，进行删除操作的端称为队头。队列中没有元素时，称为空队列。
 */
public class Queue {
	private LinkedList elementData = new LinkedList();
	//入队
	public void enQueue(Object o){	
		elementData.addLast(o);
	}
	//出队
	public Object deQueue(){
		elementData.removeFirst();
		return elementData;
	}
	
	public boolean isEmpty(){
		
		return elementData.size()==0;
	}
	
	public int size(){
		
		return elementData.size();
	}
}
