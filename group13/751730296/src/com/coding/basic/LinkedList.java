package com.coding.basic;
//参考http://www.cnblogs.com/ITtangtang/p/3948610.html
//http://blog.csdn.net/duanyugen/article/details/11523875
//循环双向链表，head.prev=tail.next;tail.next=head.prev;
public class LinkedList implements List {
	
	private Node head;
	private Node tail;
	private Object data;
	private int size;
	//在tail之前加入节点
	public void add(Object o){
		add(size-1,o);
	}
	//在该位置节点前加入一个新的节点
	public void add(int index , Object o){
		Node node=new Node(get(index).prev.next, o, get(index).prev);
		size++;
	}
	public Node get(int index){
		if (index > size || index < 0)throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		Node node;
		if(index < size()/2) {  
			node = head.next;  
			for (int i = 0;i < index;i++) {  
				node = node.next;  
			 }  
			}else {  
				node = tail;  
			 for (int i = size();i>index;i--) {  
			   node = node.prev;  
			    }  
			  }  
		return node;
	}
	
	public Object remove(Node node){
		node.prev.next=node.next;
		node.next.prev=node.prev;
		size--;
		return node.data;
	}

	public Object remove(int index){
		return remove(get(index));
	}
	
	public int size(){
		return size;
	}
	//在head之前添加节点
	public void addFirst(Object o){
		add(0,o);
	}
	//在tail后面添加节点
	public void addLast(Object o){
		add(size,o);
	}
	public Object removeFirst(){
		return remove(get(0));
	}
	public Object removeLast(){
		return remove(get(size));
	}
	
	public Iterator iterator(){
		return null;
	}
	
	
	private static  class Node{
		public Node prev;
		public Object data;
		public Node next;
		public Node(Node prev,Object data,Node next){
			this.prev=prev;
			this.data=data;
			this.next=next;
		}
	}
}
