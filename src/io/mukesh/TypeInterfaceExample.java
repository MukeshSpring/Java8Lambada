package io.mukesh;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		
		StringLengthLambada stringLengthLambada=s->s.length();
		System.out.println(stringLengthLambada.getLength("Hello Hi!!!"));
		
		
		Thread the=new Thread(()->System.out.print("Testing runnable interface"));
		the.start();
		
	}

interface StringLengthLambada
	{
		int getLength(String s);
	}
	
}

