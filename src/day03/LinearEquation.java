package day03;

import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, d, e, f;
		double x, y;
		System.out.println("请输入a，b，e的值：");
		a = input.nextDouble();
		b = input.nextDouble();
		e = input.nextDouble();
		System.out.println("请输入c，d，f的值：");
		c = input.nextDouble();
		d = input.nextDouble();
		f = input.nextDouble();
		// 关键的一步：先看分母 a*d - b*c 是不是 0。
		// 它是两个求根公式公用的分母，等于 0 就会出现「除以 0」，结果没有意义。
		// 所以先把这种情况挡掉，再往下算 —— 这就是「先验票、再干活」。
		if ((a * d - b * c) == 0) {
			System.out.println("次方程组无解");
		} else {
			// 分母已经确认不是 0，可以放心套公式了
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}
