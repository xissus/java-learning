package lesson07;

import java.util.Random;

/**
 * lesson07：数组综合练习——随机数 + 求和 + 平均 + 统计。
 * <p>
 * 需求（斯坦福大学原题，第 3 问难度较高）：
 * <ol>
 * <li>生成 10 个 1~100 的随机数存入数组</li>
 * <li>求所有随机数的和</li>
 * <li>求所有数据的平均数</li>
 * <li>统计有多少个数据比平均数小</li>
 * </ol>
 * <p>
 * 用到的关键点：{@code Random} 生成随机数（{@code nextInt(100) + 1} 得到 1~100）、
 * 动态初始化数组 {@code new int[10]}、循环遍历累加。
 * <p>
 * 运行结果示例：{@code 随机数的总和为550 / 数组的平均数为55.0 / 一共有5个数据比平均数小}
 *
 * @author 杨训杰
 */
public class ArrTest6 {
	// 导入Random包

	public static void main(String[] args) {
		/*
		 * 需求：生成10个1——100之间的随机数入库 (斯坦福大学原题只有第三问，难度较高)
		 *  1、求所有随机数的和 
		 *  2、求所有数据的平均数
		 *  3、统计有多少个数据比平均数小
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
		}   // 循环结束，就表示已经找到了比平均数小的数据
		System.out.println("一共有" + count + "个数据比平均数小");
		    // 遍历数组，验证答案
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
