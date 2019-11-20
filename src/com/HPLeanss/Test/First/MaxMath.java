package com.HPLeanss.Test.First;

public class MaxMath {
	void Max(){
		int i;
		int j;
		int[] a={1,2,4,6,7,235,856,124,85,124,987,44};
		int s = 0;
		for (i = 0; i < a.length; i++) {
			for ( j = i; j < a.length; j++) {
				if(a[i]<a[j]){
					s=a[i];
					a[i]=a[j];
					a[j]=s;

				}
			}

		}
		System.out.println("数组最大值为："+a[0]);
		System.out.println("数组最小值为:"+a[i-1]);
	}
	public static void main(String[] args) {
		new MaxMath().Max();
	}
}
