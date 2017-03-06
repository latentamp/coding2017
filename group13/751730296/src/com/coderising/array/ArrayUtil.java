package com.coderising.array;

 public class ArrayUtil { 
 	/** 
 	 * 打印数组 
 	 * @param array 
 	 */ 
 	public static void printArray(int[] array){ 
 		System.out.print("["); 
 		for(int i=0;i<array.length;i++){ 
 			if(i!=array.length-1){ 
 				System.out.print(array[i]+","); 
 			}else{ 
 				System.out.println(array[i]+"]"); 
 			} 
 		} 
 	} 
 	 
 	/** 
 	 * 给定一个整形数组a , 对该数组的值进行置换 
 		例如： a = [7, 9 , 30, 3]  ,   置换后为 [3, 30, 9,7] 
 		如果     a = [7, 9, 30, 3, 4] , 置换后为 [4,3, 30 , 9,7] 
 	 * @param origin 
 	 * @return 
 	 */ 
 	public static void reverseArray(int[] origin){ 
 		for(int i=0;i<origin.length/2;i++){ 
 			int temp=origin[i]; 
 			origin[i]=origin[origin.length-1-i]; 
 			origin[origin.length-1-i]=temp; 
 		} 
 	} 
 	 
 	/** 
 	 * 获取元素a在数组array中第一次出现的问题，有则输出位置，无则输出-1； 
 	 * @param array 
 	 * @param a 
 	 * @return 
 	 */ 
 	public static int getFirstIndex(int[] array,int a){ 
 		int index=-1; 
 		for(int i=0;i<array.length;i++){ 
 			if(array[i]==a){ 
 				index=i; 
 				break; 
 			} 
 		} 
 		return index; 
 	} 
 
 
 	/** 
 	 * 删除数组array中第一次出现的a元素。 
 	 * @param array 
 	 * @param a 
 	 * @return 
 	 */ 
 	public static int[] removeFirst(int[] array,int a){ 
 		int index=getFirstIndex(array,a); 
 		return removeIndex(array,index); 
 	} 
 	/**
 	 * 删除数组array中index位置的元素。
 	 * @param array
 	 * @param index
 	 * @return
 	 */
 	public static int[] removeIndex(int[] array,int index){
 		int[] newArray =new int[array.length-1]; 
 		System.arraycopy(array, index+1, array, index, array.length-1-index); 
 		System.arraycopy(array, 0, newArray, 0, array.length-1); 
 		return newArray;
 	}
 	
 	/** 
 	 * 现在有如下的一个数组：   int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}    
 	 * 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：    
 	 * {1,3,4,5,6,6,5,4,7,6,7,5}   
 	 * @param oldArray 
 	 * @return 
 	 */ 
 	public static int[] removeZero(int[] oldArray){ 
 		while(getFirstIndex(oldArray,0)!=-1){ 
 			oldArray=removeFirst(oldArray,0); 
 		} 
 		return oldArray; 
 	} 
 	 
 	/** 
 	 * 给定两个已经排序好的整形数组， a1和a2 ,  创建一个新的数组a3, 使得a3 包含a1和a2 的所有元素， 并且仍然是有序的 
 	 * 例如 a1 = [3, 5, 7,8]   a2 = [4, 5, 6,7]    则 a3 为[3,4,5,6,7,8]    , 注意： 已经消除了重复 
 	 * @param array1 
 	 * @param array2 
 	 * @return 
 	 * 思路：先合并，再去重复，再排序
 	 */ 
 	 
 	public static int[] merge(int[] array1, int[] array2){ 
 		int[] array =new int[array1.length+array2.length];
 		System.arraycopy(array1, 0, array, 0,array1.length);
 		System.arraycopy(array2, 0, array, array.length-array2.length,array2.length);
 		array=sort(removeSameNum(array));
 		return  array; 
 	} 
 	
 	/**
 	 * 给数组array去除重复的元素
 	 * @param array
 	 * @return
 	 */
 	public static int[] removeSameNum(int[] array){
 		for(int i =0;i<array.length;i++){
 			for(int j=i+1;j<array.length;j++){
 				if(array[j]==array[i]){
 					array=removeIndex(array,j);
 				}
 			}
 		}
 		return array;
 	}
 	/**
 	 * 冒泡排序
 	 * @param array
 	 * @return
 	 */
 	public static int[] sort(int[] array){
 		for(int j=0;j<array.length-1;j++){
 			for(int i=j+1;i<array.length;i++){
 				int min=array[j];
 				if(array[i]<min){
 					array[j]=array[i];
 					array[i]=min; 
 				}
 			}
 		}
 		return array;
 	}
 	
 	/** 
 	 * 把一个已经存满数据的数组 oldArray的容量进行扩展， 扩展后的新数据大小为oldArray.length + size 
 	 * 注意，老数组的元素在新数组中需要保持 
 	 * 例如 oldArray = [2,3,6] , size = 3,则返回的新数组为 
 	 * [2,3,6,0,0,0] 
 	 * @param oldArray 
 	 * @param size 
 	 * @return 
 	 */ 
 	public int[] grow(int [] oldArray,  int size){ 
 		int[] newArray =new int[oldArray.length+size];
 		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
 		return newArray; 
 	} 
 	/**
 	 * 返回斐波那契数列的第n个元素
 	 * @param n
 	 * @return
 	 */
 	public static int fibonacciNum(int n){
 		if(n==0||n==1){
 			return 1;
 		}else{
 			return fibonacciNum(n-1)+fibonacciNum(n-2);
 		}
 	}
 	 
 	/** 
 	 * 斐波那契数列为：1，1，2，3，5，8，13，21......  ，给定一个最大值， 返回小于该值的数列 
 	 * 例如， max = 15 , 则返回的数组应该为 [1，1，2，3，5，8，13] 
 	 * max = 1, 则返回空数组 [] 
 	 * @param max 
 	 * @return 
 	 */ 
 	
 	public static int[] fibonacci(int max){ 
 		int[] array =new int[max];
 		for(int i=0;i<max;i++){
 			if(fibonacciNum(i)<max){
 				array[i]=fibonacciNum(i);	
 			}
 		}
 		return removeZero(array); 
 	} 
 	 
 	public static boolean isPrime(int n){
 		int[] array=getFactors(n);
 		sum(array);
 		return sum(array)==1;
 	}
 	
 	/** 
 	 * 返回小于给定最大值max的所有素数数组 
 	 * 例如max = 23, 返回的数组为[2,3,5,7,11,13,17,19] 
 	 * @param max 
 	 * @return 
 	 */ 
 	public static int[] getPrimes(int max){ 
 		int count=0;
 		int[] array =new int[max];
 		for(int i=2;i<max;i++){
 			if(isPrime(i)){
 				array[count]=i;
 				count++;
 			}
 		}
 		return removeZero(array); 
 	} 
 	 
 	
 	
 	/** 
 	 * 所谓“完数”， 是指这个数恰好等于它的因子之和，例如6=1+2+3 
 	 * 给定一个最大值max， 返回一个数组， 数组中是小于max 的所有完数 
 	 * @param max 
 	 * @return 
 	 */ 

 	public static int[] getPerfectNumbers(int max){
 		int[] numbers=new int[10];
 		int count=0;
 		for(int i=2;i<max;i++){
 			 int[] array=getFactors(i);
 	 		 if(sum(array)==i){
 	 			numbers[count]=i;
 	 			count++;
 	 		 }		 
 		}
 		return removeZero(numbers);
 	} 
 	/**
 	 * 返回某个整数m的所有因子组成的数组,m本身除外。
 	 * @param m
 	 * @return
 	 */
 	public static int[] getFactors(int m){
 		int[] array =new int[m];
 		for(int i=1;i<m;i++){
 			if(m%i==0){
 				array[i-1]=i;
 			}
 		}
 		return removeZero(array); 
 	} 
 	/**
 	 * 给定数组array，求该数组中各元素之和 sum
 	 * @param array
 	 * @return
 	 */
 	public static int sum(int[] array){
 		 int sum=0;
 		 for(int i=0;i<array.length;i++){
 			 sum=sum+array[i];
 		 }
 		return sum;
 	}
 	
 	 
 	/** 
 	 * 用seperator 把数组 array给连接起来 
 	 * 例如array= [3,8,9], seperator = "-" 
 	 * 则返回值为"3-8-9" 
 	 * @param array 
 	 * @param s 
 	 * @return 
 	 */ 
 	public static String join(int[] array, String seperator){ 
 		String s=""; 
 		for(int i=0;i<array.length;i++){ 
 			if(i==array.length-1){ 
				s=s+array[i]; 
			}else{ 
 				s=s+array[i]+seperator; 
			} 
 		} 
 		return s; 
 	} 
 	 
 
 
 } 
