package com.test.lambda;

public class LambdaTest3 implements FunIntreface3 {

	@Override
	public void fun() {
		System.out.println("LambdaTest3.fun");
	}

	@Override
	public void print() {
//		FunIntreface3.super.print();
		System.out.println("LambdaTest3.print");
	}
	
	public static void main(String[] args) {
		LambdaTest3 lambdaTest3 = new LambdaTest3();
		lambdaTest3.fun();
		lambdaTest3.print();
	}
}
