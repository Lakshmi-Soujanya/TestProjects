package com.basics;

public class Math3 {

	public static void main(String[] args) {
	
		Math3 math2 = new Math3();
		int d=	math2.add(10,7,true);
		int d1= math2.add(13,3, false);
		float d2= math2.mul(2,2,true);
		float d3= math2.mul(4,2,false);
		String d4 =math2.wed("sai","souji");
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
	}	
	
	
	
protected   int add(int a, int b, boolean T){
	
	int c=0;
	if(T){
	 c=a+b;	
	}
	else{
		c=a-b;
	}
	return c;
}
public  float mul(int e,int f, boolean F){
float g=0;
if(F){
	g=e*f;
}
else{
	g=e/f;
}
return g;
}
public  String wed(String a1,String a2){	
	
	
	return a1.concat(" weds ").concat(a2);
}
}
