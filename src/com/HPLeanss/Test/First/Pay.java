package com.HPLeanss.Test.First;

public class Pay {
	public static void main(String[] args) {
    int  T_shirt_money=245;
    int sandshoe_money=570;
    int tennisracket_money=320;
    double discount=0.8;
    double sum;
    sum=(T_shirt_money+sandshoe_money+tennisracket_money)*discount;
    System.out.println("折扣后价格为"+sum);
	}
}
