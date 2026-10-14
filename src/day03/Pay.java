package day03;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入付款金额");
		// 读入付款金额
		int Money = sc.nextInt();

		// 注意这里是「大于等于」>= ：正好 600 元也算付款成功。
		// 和 EatFood 的 > 比一比，只差一个等号 —— 等于归哪边，写之前先定好。
		if (Money >= 600) {
			System.out.println("付款成功");
		} else {
			System.out.println("付款失败");
		}
	}
}
