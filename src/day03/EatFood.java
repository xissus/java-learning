package day03;

import java.util.Scanner;

public class EatFood {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入身上的钱");
		int Money = sc.nextInt();
		if (Money > 100) {
			System.out.println("去网红餐厅");
		} else {
			System.out.println("吃沙县小吃");
		}
	}
}
