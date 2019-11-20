package com.HPLeanss.Test.First;

public class Sum {
	static int sum=0;
	public static void main(String[] args) {
              for (int i = 1; i <= 100;i++) {
			   if(i%2!=0){
				   sum=sum+i;
			   }
			}
              System.out.println("1-100的奇数总和为"+sum);
	}
}
