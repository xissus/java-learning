package day02;

import java.util.Scanner;

public class Temperature1 {

	/**
	 * 程序入口：读入华氏度并输出对应摄氏度。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个华氏度:");
		double f = sc.nextDouble();

		double t = (f - 32) * 5.0 / 9.0;

		System.out.println("摄氏度为:" + t);

		sc.close();
	}
}
