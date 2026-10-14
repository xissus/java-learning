package lesson03;

import java.util.Scanner;

public class GuessCompare {

	/**
	 * 程序入口：读取一个整数并与固定答案比较。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int secret = 25; // 本课的固定答案

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");

		int guess = scanner.nextInt();

		if (guess < secret) {
			System.out.println("太小了喵");
		} else if (guess > secret) {
			System.out.println("太大了喵");
		} else {
			System.out.println("恭喜，猜中了喵");
		}

		scanner.close();
	}
}
