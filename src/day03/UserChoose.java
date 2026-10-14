package day03;

import java.util.Scanner;

public class UserChoose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请在1~4中选择服务");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			System.out.println("机票查询");
			break;
		case 2:
			System.out.println("机票预订");
			break;
		case 3:
			System.out.println("机票改签");
			break;
		case 4:
			System.out.println("退出服务");
			break;
			default :
				System.out.println("退出服务");
				break;
		}

	}

}
