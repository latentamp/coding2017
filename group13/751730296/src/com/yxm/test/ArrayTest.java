package com.yxm.test;

import com.coderising.array.ArrayUtil;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = {1,2,3,0,7,0,5,8,0,9,0,0};
		//ArrayUtil.reverseArray(array);
		//ArrayUtil.printArray(array);
		//System.out.println(ArrayUtil.getFirstIndex(array, 4));
		//ArrayUtil.printArray(array);
		//ArrayUtil.printArray(ArrayUtil.removeFirst(array, 0));
		//ArrayUtil.printArray(ArrayUtil.removeZero(array));
		System.out.println(ArrayUtil.join(array, "-"));
	}

}
