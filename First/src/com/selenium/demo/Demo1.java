package com.selenium.demo;

public class Demo1 {
	public void sub(int a, int b){
		int c=0;
		c=a-b;
	System.out.println("Subration of  "  +a +" and " +b + " is " +c);
	}
	public void add(int a1, int b1, int c1, int d1){
		int e=0;
		e=a1+b1+c1+d1;
		System.out.println("addition value  " +e);
	}
	public void weds(String a2, String b2){
		//String c2;
		//c2= a2 + b2;
		System.out.println(a2 +"  weds   " +b2);
	}

public static void main(String[] args){
	Demo1 demo=new Demo1();	
	demo.sub(20,10);
	demo.add(20,30,10,15);
	demo.weds("sai","souji");
	
}
}
