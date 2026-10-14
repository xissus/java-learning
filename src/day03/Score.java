package day03;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		double Score = sc.nextDouble();
		if (Score >= 95 && Score <= 100) {
			System.out.println("送一辆自行车");
		} else if (Score >= 90 && Score <= 94) {
			System.out.println("游乐场玩一天");
		} else if (Score >= 80 && Score <= 89) {
			System.out.println("送一个变形金刚");
		} else {
			System.out.println("挨揍");

		}

	}
}
