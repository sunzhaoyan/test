package com.test.alg;

public class TestFibonacci {
	public static void main(String[] args) {
		System.out.println(getFibonacci(50));
		System.out.println(getFibonacci2(50));
		System.out.println(getFibonacci3(50));
		System.out.println(getFibonacci4(50));
	}

	/**
	 * 传统递归算法 TODO szy 2016年12月7日 上午10:30:49
	 * 
	 * @param index
	 * @return Long
	 */
	public static Long getFibonacci(int index) {
		if (index == 1 || index == 2) {
			return 1l;
		} else {
			return getFibonacci(index - 1) + getFibonacci(index - 2);
		}
	}

	/**
	 * 数学表达式算法Fib(n) = [(1＋√5)/2]^n /√5 － [(1－√5)/2]^n /√5 TODO szy 2016年12月7日
	 * 上午10:31:19
	 * 
	 * @param index
	 * @return Long
	 */
	public static Long getFibonacci2(int index) {
		return (long) ((Math.pow((1 + Math.sqrt(5.0)) / 2, index) - Math.pow((1 - Math.sqrt(5.0)) / 2, index))
				/ Math.sqrt(5.0));
	}

	/**
	 * 循环函数法 TODO szy 2016年12月7日 上午10:51:43
	 * 
	 * @param index
	 * @return Long
	 */
	public static Long getFibonacci3(int index) {
		long a = 1;
		long b = 1;
		long c = 1;
		for (int i = 3; i <= index; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	/**
	 * 循环向量法 TODO szy 2016年12月7日 上午10:56:10
	 * 
	 * @param index
	 * @return Long
	 */
	public static Long getFibonacci4(int index) {
		long fi = 0l;
		long[] fib = new long[index];
		fib[0] = 1l;
		fib[1] = 1l;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			fi = fib[i];
		}
		return fi;
	}
}
