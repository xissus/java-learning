package lesson06;

import java.util.Scanner;

public class ArrayTest4 {

	/**
	 * 程序入口：循环录入 50 个学生姓名并逐个打印。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String[] 表示「元素是 String 的数组」；这里申请 50 个位置
		String[] arr = new String[50];

		// 循环录入：next() 读到空格或回车为止
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生姓名：");
			arr[i] = sc.next();
		}

		System.out.println();
		System.out.println("输入的学生姓名为：");

		// 循环打印
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第" + (i + 1) + "个学生姓名：" + arr[i]);
		}

		sc.close();
	}
}
