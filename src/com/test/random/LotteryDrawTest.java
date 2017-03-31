package com.test.random;


import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class LotteryDrawTest {

	@Test
	public void testMake() {
		LotteryDraw draw = new LotteryDraw();
		draw.setRoleCode(2);
		int counter = 100;
		while (counter > 0) {
			String result = draw.make();
			System.out.println(result);
			counter--;
		}
	}
	
	@Test
	public void testRandom() {
		Random random = new Random();
		int counter = 100;
		while(counter > 0) {
			int x = random.nextInt(2);
			if (x == 2) {
				System.out.println(2);
			}
			counter--;
		}
	}
	
	@Test
	public void copyArr() {
		LotteryDraw draw = new LotteryDraw();
		String[] oldArr = {"1", "2", "3", "4", "5", "6", "7"};
//		String[] newArr = draw.removeEleByIndex(oldArr, oldArr.length - 1);
		String[] newArr = draw.removeLastIndex(oldArr);
		System.out.println(Arrays.toString(oldArr));
		System.out.println(Arrays.toString(newArr));
	}

}
