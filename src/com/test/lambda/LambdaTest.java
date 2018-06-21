package com.test.lambda;

public class LambdaTest {
	public static void main(String[] args) {
//		Runnable r = () -> System.out.println("123");
//		r.run();
		
		FunInterface fi = () -> System.out.println("函数式接口实现...");
		fi.fun();
		
//		Lambda expression's signature does not match the signature of the 
//		functional interface method fun()
//		FunInterface fi2 = (a) -> System.out.println("函数式接口实现...");
//		fi.fun();
		
//		The target type of this expression must be a functional interface
//		NoFunInterface nfi = () -> System.out.println("非函数式接口实现...");
//		NoFunInterface2 nfi = () -> System.out.println("非函数式接口实现...");
		
		new Thread(() -> System.out.println("Runnable.run() 的方法实现...")).start();;
	}
}
