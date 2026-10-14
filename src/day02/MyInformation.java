package day02;

import java.util.Scanner;

public class MyInformation {

	/**
	 * 程序入口：读入个人信息并格式化输出。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("请输入姓名：");
		String name = sc.nextLine();

		System.out.print("请输入学号：");
		String studentId = sc.nextLine();

		System.out.print("请输入性别：");
		String gender = sc.nextLine();

		System.out.print("请输入年龄：");
		int age = sc.nextInt();
		sc.nextLine(); // 吃掉 nextInt 留下的回车符，否则下一句会读到空行

		System.out.print("请输入一句自我激励的话：");
		String motto = sc.nextLine();

		System.out.println();

		System.out.println("姓名：" + name);
		System.out.println("学号：" + studentId);
		System.out.println("性别：" + gender);
		System.out.println("年龄：" + age);

		System.out.println("自我激励：" + motto);

		sc.close();
	}
}
