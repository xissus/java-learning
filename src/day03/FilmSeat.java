package day03;

import java.util.Scanner;

public class FilmSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询的票号");
		int ticket = sc.nextInt();
		if (ticket >= 0 && ticket <= 100) {

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
