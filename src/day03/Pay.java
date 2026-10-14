package day03;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入付款金额");
		int Money = sc.nextInt();
		if (Money >= 600) {
			System.out.println("付款成功");
		}
		else {
		    System.out.println("付款失败");
	    }
	}
}

