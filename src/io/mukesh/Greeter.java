package io.mukesh;

import java.util.Arrays;

public class Greeter {

	public static void main(String[] args) {
				
		Greeting innerAnnony=new Greeting()
		{

			@Override
			public void perform() {
				System.out.println("Hello World!!!");
				
			}
			
		};
		
		
		Greeting myLambdaFunction = ()-> System.out.println("Hello Wolrd");
		myLambdaFunction.perform();
	}

}
