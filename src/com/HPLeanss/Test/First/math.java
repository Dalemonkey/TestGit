package com.HPLeanss.Test.First;

public class math {
	public static void main(String[] args) {
		int[] grade = {87,88,89,98,78}; 
		int m; 
		for(int i = 0; i < 2; i++)
		{  m = grade[i]; 
		grade[i] = grade[5-i-1];
		grade[5-i-1] = m; 
		} 
		for(int j =0; j < 5; j++)
		{ 
			System.out.println(grade[j]); 
		} 
	} 
}
