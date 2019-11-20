package com.HPLeanss.Test.First;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	void test(){
//		int[] x=new int[3];//两个数组引用同一对象
//		int[]y=x;
//		y[0]=10;
//		System.out.println(x[0]);
		
		
//		int[] x=new int[3];
//		int[]y=new int[3];//创建了一个新的对象
//		y[0]=10;
//		System.out.println(x[0]);
		
		
//		int[] arr={-11,12,-3,234,52,435,44,543,43};
//		int temp=0;
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]<temp){
//				temp=arr[i];
//			}
//		}
//		System.out.println(temp);
//		String s="abc";
//		s="abcde";
//		System.out.println(s);
//		byte[]b={65,66,67,68};
//		String s2=new String(b);
//		System.out.println(s2);
		Set set = new HashSet();
		set.add("zhangsan");
		set.add("zhangsan");
		System.out.println(set.size()); //
		set.add(new String("zhangsan"));
		set.add(new String("zhangsan"));
		System.out.println(set.size());  //
	}
	
	public static void main(String[] args) {
		new Test().test();
		System.out.println("git test lefe....");
		System.out.println("git test right....");
	}
}
