package day02;

import java.util.Scanner;

public class ScannerDemo1 {

	/**
	 * 程序入口：用两个 Scanner 分别读一个整数并求和。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("请输入一个整数");
		int i1 = sc1.nextInt();
		System.out.println("请再输入一个整数");
		int i2 = sc2.nextInt();

		System.out.println("两数和为" + (i1 + i2));

		sc1.close();
		sc2.close();
	}
}
