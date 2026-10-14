package day03;

import java.util.Scanner;

public class WeekSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入今天的星期");
		int week = sc.nextInt();
		switch (week) {
		case 1:
			System.out.println("跑步");
			break;
		case 2:
			System.out.println("做操");
			break;
		case 3:
			System.out.println("踢足球");
			break;
		case 4:
			System.out.println("羽毛球");
			break;
		case 5:
			System.out.println("打篮球");
			break;
		case 6:
			System.out.println("跳绳");
			break;
		case 7:
			System.out.println("游泳");
			break;
		default:
			System.out.println("没有这个星期");
			break;

		}
	}

}
