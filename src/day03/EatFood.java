package day03;

import java.util.Scanner;

public class EatFood {

	public static void main(String[] args) {
		// 创建一个 Scanner 用来读键盘输入（写这一行之前要先 import java.util.Scanner;）
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入身上的钱");
		// 读入一个整数，存进变量 Money
		int Money = sc.nextInt();

		// 钱「大于」100 才去网红餐厅。
		// 注意是 > 不是 >=，所以正好 100 元的人会走下面的 else —— 等于算哪边，先想清楚再写。
		if (Money > 100) {
			System.out.println("去网红餐厅");
		} else {
			// 剩下的情况全都会进这里：钱 <= 100
			System.out.println("吃沙县小吃");
		}
	}
}
