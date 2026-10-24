package day04;

import java.util.Scanner;

public class ForDemo2 {

	public static void main(String[] args) {
		// 分析：
		// 键盘录入两个数字，统计该范围中既能被3又能被5整除的数有多少个
		Scanner sc = new Scanner(System.in);
		System.out.println("开始范围为");
		int num1 = sc.nextInt();
		System.out.println("结束的范围为");
		int num2 = sc.nextInt();
		int count = 0;// 定义一个统计变量
		// 利用循环获取范围中的每个数字
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {// 嵌套一个if循环
				count++;// 记录个数
			}
		}
		System.out.println(count);
	}
}
