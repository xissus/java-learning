package day02;

import java.util.Scanner;

public class LeapYear {

	/**
	 * 程序入口：读入年份并判断是否为闰年。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入需要判断的年份：");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}

		sc.close();
	}
}
