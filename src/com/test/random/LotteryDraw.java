package com.test.random;

import java.util.Random;


/**
 * 抽奖的类
 * 
 * @author szy
 * @date 2016年9月21日 上午10:16:16
 *
 */
public class LotteryDraw {
	/** 角色对应的中奖概率 */
	private static final int[] ROLE_PROB = { 1, 10, 100, 1000, 10000, 10000 };
	/** 角色中奖的个数  */
	private static final int[] ROLE_GOODS = { 1, 2, 4, 8, 16, 32 };
	private static String[] goods_1 = {"java一个"};
	private static String[] goods_2 = {"C一个", "C++一个"};
	private static String[] goods_3 = {"perl一个", "go一个", "ruby一个", "python一个"};
	private static String[] goods_4 = {"一个..."};
	private static String[] goods_5 = {"一个..."};
	private static String[] goods_6 = {"一个..."};
	/** 角色编号 */
	private int roleCode = -1;
	/** 是否中奖 */
	private boolean bingo = false;

	public LotteryDraw() {
	}

	public LotteryDraw(int roleCode) {
		this.roleCode = roleCode;
	}

	public int getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(int roleCode) {
		this.roleCode = roleCode;
	}

	public boolean isBingo() {
		return bingo;
	}

	public String make() {
		String result = "很遗憾您没有中奖";
		if (roleCode == -1 || roleCode >= ROLE_PROB.length) {
			return result; 
		}
		int goods = ROLE_GOODS[roleCode];
		if (goods <= 0) {
			return result;
		}
		Random random = new Random();
		int isYou = random.nextInt(ROLE_PROB[roleCode]);
		if (isYou + 1 <= goods) {
			String[] goods_no = chooseGoods(roleCode);
			result = "恭喜您，中了" + goods_no[goods_no.length - 1];
			bingo = true;
			ROLE_GOODS[roleCode] = --goods;
		}
		return result;
	}
	
	private String [] chooseGoods(int roleCode) {
		String[] str = {};
		switch(roleCode) {
			case 0 :
				str = goods_1;
				goods_1 = removeLastIndex(goods_1);
				break;
			case 1 :
				str = goods_2;
				goods_2 = removeLastIndex(goods_2);
				break;
			case 2 :
				str = goods_3;
				goods_3 = removeLastIndex(goods_3);
				break;
			case 3 :
				str = goods_4;
				goods_4 = removeLastIndex(goods_4);
				break;
			case 4 :
				str = goods_5;
				goods_5 = removeLastIndex(goods_5);
				break;
			case 5 :
				str = goods_6;
				goods_6 = removeLastIndex(goods_6);
				break;
		}
		return str;
	}
	
	protected String[] removeEleByIndex(String[] oldArr, int index) {
		String[] newArr = new String[oldArr.length - 1];
		boolean isThat = false;
		for (int i = 0; i < oldArr.length; i++) {
			if (i == index) {
				isThat = true;
				continue;
			}
			if(!isThat) {
				newArr[i] = oldArr[i];
			} else {
				newArr[i - 1] = oldArr[i];
			}
		}
		return newArr;
	}
	
	protected String[] removeLastIndex(String[] oldArr) {
		String[] newArr = new String[oldArr.length - 1];
		for (int i = 0; i < oldArr.length -1; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}
