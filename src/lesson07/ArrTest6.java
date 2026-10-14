package lesson07;

import java.util.Random;

public class ArrTest6 {
	// 导入Random包

	public static void main(String[] args) {
		/*
		 * 需求：生成10个1——100之间的随机数入库 (斯坦福大学原题只有第三问，难度较高) 1、求所有随机数的和 2、求所有数据的平均数
		 * 3、统计有多少个数据比平均数小
		 *
		 */
		// 分析：
		// 1、定义数组
		int[] arr = new int[10];// 动态初始化
		// 2、把随机数存入当前数组当中
		Random r = new Random();// 生成随机数
		for (int i = 0; i < arr.length; i++) {// 每循环一次就生成一次新的随机数
			int number = r.nextInt(100) + 1;// 记录随机数
			// 把生成的随机数添加到数组中
			// 公式：数组名[索引] = 数据
			arr[i] = number;

			// 1、求和，依旧放在循环外边
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("随机数的总和为" + sum);

		// 2、求所有数的平均数
		// 注意：sum 和 arr.length 都是 int，整数相除会砍掉小数部分（如 547/10 = 54 而不是 54.7）
		// 改成 double avg = (double) sum / arr.length; 才是精确的小数平均数
		// （这一处保留原样，当作踩坑记录；day01 学过的「整数除法截断」就是这个现象）
		double avg = sum / arr.length;
		System.out.println("数组的平均数为" + avg);
		// 3、统计有多少个数据比平均数小
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) {
				count++;

			}
		} // 循环结束，就表示已经找到了比平均数小的数据
		System.out.println("一共有" + count + "个数据比平均数小");
		// 遍历数组，验证答案
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
