package day02;

import java.util.Scanner;

public class Test1 {

	/**
	 * 程序入口：读入三位整数并输出各位数字。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个三位整数");
		int number = sc.nextInt();

		int ge = number % 10;
		int shi = number / 10 % 10;
		int bai = number / 100 % 10;

		System.out.println("个位是" + ge);
		System.out.println("十位是" + shi);
		System.out.println("百位是" + bai);

		sc.close();
	}
}
