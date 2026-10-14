package lesson02;

import java.util.Scanner;

public class GuessMini {

	/**
	 * 程序入口：读取一个整数并打印。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入一个整数喵");

		int number = scanner.nextInt();

		System.out.println("你输入的是: " + number);
		scanner.close();
	}
}
