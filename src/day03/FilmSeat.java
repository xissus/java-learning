package day03;

import java.util.Scanner;

public class FilmSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询的票号");
		int ticket = sc.nextInt();
		// 第一层：先确认票号是合法的（0~100 之间）。
		// && 表示「两个条件都要成立」——左边 >= 0、右边 <= 100，缺一个都不算在范围内。
		if (ticket >= 0 && ticket <= 100) {

			// 第二层：票号合法了，才轮到判断奇偶。
			// % 是取余，ticket % 2 等于 1 说明是奇数。奇数在右、偶数在左。
			if (ticket % 2 == 1) {
				System.out.println("座位在右边");
			} else {
				System.out.println("座位在左边");
			}
		} else {

			System.out.println("请输入0-100的票号");
		}
		sc.close();
	}

}
