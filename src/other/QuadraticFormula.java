package other;

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		// 需求：利用公式求一元二次方程的两根
		// 输入系数a,b.c的值根据判别式，判断根的情况并求解

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入方程的系数a：");
		int a = sc.nextInt();

		// 检查：a 不能为 0。
		// 因为 a = 0 时方程就不是「二次」方程了（变成 bx + c = 0），
		// 再套求根公式会出现除以 0，算出 NaN（不是一个数）和 Infinity（无穷大）。
		// return 的意思是「立刻结束这个方法」——写在 main 里就是直接结束整个程序，
		// 后面的代码都不会执行。
		if (a == 0) {
			System.out.println("a 不能为 0，否则就不是一元二次方程了");
			sc.close();
			return;
		}

		System.out.println("请输入方程的系数b：");
		int b = sc.nextInt();
		System.out.println("请输入方程的系数c：");
		int c = sc.nextInt();
		double delta = (b * b) - (4 * a * c);
		if (delta > 0) {
			double sqrtDelta = Math.sqrt(delta);
			double root1 = (-b + sqrtDelta) / (2 * a);
			double root2 = (-b - sqrtDelta) / (2 * a);
			System.out.println("方程有两个不相等的实根");
			System.out.println("X1=" + root1);
			System.out.println("X2=" + root2);
		} else if (delta == 0) {
			// 这里写 2.0 而不是 2：如果写 2，-b / (2 * a) 会变成整数除法，把小数砍掉
			double root = -b / (2.0 * a);
			System.out.println("方程有两个相等的实根");
			System.out.println("X1=X2=" + root);
		} else {
			// delta < 0：在实数范围内没有根（数学上更准确的说法是「没有实数根」）
			System.out.println("方程无解");

		}
		sc.close();

	}

}
