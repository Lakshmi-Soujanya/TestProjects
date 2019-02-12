package com.basics;

public class Math extends Math2{

	public static void main(String[] args) {
	
	int d=	add(10,7);
	System.out.println(d);
	
	Math2 airthmatic =  new Math2();
	int d1=airthmatic.add(10, 10, true);
	float d2=airthmatic.mul(2, 2, false);
	System.out.println(d1);
	System.out.println(d2);
	}

	
	
public static  int add(int a, int b){
	int c=a+b;
	return c;
}
}
