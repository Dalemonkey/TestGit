package com.HPLeanss.Test.First;

public class ChangeMath { 
	void ChangeMath(){
		int[] a={1,2,3,4,5,6,7,8,9};
		int s=0;
		for (int i = 0; i < a.length/2; i++) {
			s=a[i];
			a[i]=a[9-i-1];
			a[9-i-1]=s;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
	public static void main(String[] args) {
		new ChangeMath().ChangeMath();
	}
}
