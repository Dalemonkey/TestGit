package com.HPLeanss.Test.First;

public class SumSevent {
	static int sum=0;
	static int count=0;
	public static void main(String[] args) {
		for (int i = 7; i <=100; i++) {
            if(i%7==0){
            	sum=sum+i;
            	count++;
            }
		}
		System.out.println("1-100��7�ı����ĸ�����"+count+"      "+"�ܺ���"+sum);
	}
}
