package com.test.alg.sort;

import java.util.Arrays;
import java.util.Random;

public class Sort {
	public static void main(String[] args) {
		// int[] arr = { 5, 10, 12, 97, 72, 91, 52, 90, 21, 3 };
		int[] arr = printRandom(1, 100, 10);
		System.out.println(Arrays.toString(arr));
		// arr = MPSort(arr);
		// arr = XZSort(arr);
//		arr = CRSort(arr);
		arr = KSSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 冒泡排序<br/>
	 * 比较相邻两个数，大数放后面
	 * 
	 * @author szy
	 * @date 2016年12月21日 上午11:24:05
	 * @param arr
	 * @return int[]
	 */
	public static int[] MPSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swaped = false;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
					swaped = true;
				}
			}
			if (!swaped) {
				break;
			}
		}
		return arr;
	}

	/**
	 * 选择排序 <br/>
	 * 找到最小的和第一个交换，二小的和第二个交换 <br/>
	 * szy 2016年12月21日 下午2:41:18
	 * 
	 * @param arr
	 * @return int[]
	 */
	public static int[] XZSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
		return arr;
	}

	/**
	 * 插入排序 （待完善）<br/>
	 * 当前索引遍历数组<br/>
	 * 当前索引左边为有序数组<br/>
	 * 将索引位置所在的元素插入到左边有序数组中<br/>
	 * szy 2016年12月21日 下午2:52:10
	 * 
	 * @param arr
	 * @return int[]
	 */
	@Deprecated
	public static int[] CRSort(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			int t = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > t) {
				// 将大于a[i]的值都后移
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j] = t;// 插入
		}
		return arr;
	}

	/**
	 * 快速排序<br/>
	 * 先对输入的数据进行洗牌<br/>
	 * 以数据a[j]为中心进行分区，使得a[j]左侧的数据都小于等于a[j]，a[j]右侧的数据都大于等于a[j]<br/>
	 * 分区完后递归排序<br/>
	 * szy 2016年12月21日 下午2:57:26
	 * 
	 * @param arr
	 * @return int[]
	 */
	public static int[] KSSort(int[] arr) {
		sort(arr);
		return arr;
	}

	/**
	 * 归并排序<br/>
	 * 要将一个数组排序，可以先（递归地）将它分成两半进行排序，然后将结果归并起来。
	 * szy
	 * 2016年12月21日 下午3:59:27
	 * @param arr
	 * @return
	 * int[]
	 */
	public static int[] GBSort(int[] arr) {
		return arr;
	}

	public static int[] DSort(int[] arr) {
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * 产生min到max范围内 num个随机整数数组 TODO szy 2016年12月21日 下午2:43:07
	 * 
	 * @param min
	 * @param max
	 * @param num
	 */
	private static int[] printRandom(int min, int max, int num) {
		int[] arr = new int[num];
		int x = -1;
		for (int i = 0; i < num; i++) {
			x = (int) (Math.random() * max + min);
			arr[i] = x;
		}
		return arr;
	}

	private static int partition(int[] arr, int lo, int hi) {
		int i = lo, j = hi + 1;
		// 选取第一个元素为切分元素，a[lo]
		while (true) {
			// 从左扫描出第一个大于a[lo]的元素
			while (arr[++i] < arr[lo]) {
				if (i == hi) {
					break;
				}
			}
			// 从右扫描出第一个小于a[lo]的元素
			while (arr[--j] > arr[lo]) {
				if (j == lo) {
					break;
				}
			}

			// 上述元素不存在
			if (i >= j)
				break;
			// 将较小元素移至a[lo]左边,较大元素移至右边
			swap(arr, i, j);
		}

		// 将a[lo]移至中间
		swap(arr, lo, j);
		return j;
	}

	private static void sort(int[] arr, int lo, int hi) {
		if (hi <= lo) {
			return;
		}

		// 切分
		int i = partition(arr, lo, hi);

		// 左子数组排序
		sort(arr, lo, i - 1);
		// 右子数组排序
		sort(arr, i + 1, hi);
	}

	private static void shuffle(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = random.nextInt(arr.length);
			swap(arr, i, j);
		}
	}

	public static void sort(int[] arr) {
		// 为了保障快速排序的性能, 在排序之前进行打乱操作
		// 另外一种方法是在partition()方法中随机选择一个切分元素
		shuffle(arr);
		sort(arr, 0, arr.length - 1);
	}
}
