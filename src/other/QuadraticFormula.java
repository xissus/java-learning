package other;

import java.util.Scanner;

/**
 * other：解一元二次方程——用求根公式算出 ax² + bx + c = 0 的根。
 * <p>
 * <b>求根公式：</b>{@code x = (-b ± √(b²-4ac)) / 2a}，其中 {@code b²-4ac} 叫做<b>判别式</b>（delta）。
 * 判别式的正负决定了根的情况：
 * <ul>
 * <li>{@code delta > 0}：两个不相等的实根</li>
 * <li>{@code delta == 0}：两个相等的实根（其实只有一个根）</li>
 * <li>{@code delta < 0}：在实数范围内没有根</li>
 * </ul>
 * <p>
 * <b>运行后你会看到（输入 1、-3、2）：</b>
 * <pre>
 * 方程有两个不相等的实根
 * X1=2.0
 * X2=1.0
 * </pre>
 * <p>
 * <b>⚠️ 这个程序有一个没处理的漏洞，请你先别急着照抄：</b>
 * 如果 {@code a 输入 0}，方程就不是二次方程了（退化成 bx + c = 0），
 * 但程序照样套求根公式，会算出 {@code NaN}（不是数）和 {@code Infinity}（无穷大）。
 * 自己想想：要怎么改才能拦住 a = 0 的情况？
 *
 * @author 杨训杰
 */
public class QuadraticFormula {

	public static void main(String[] args) {
		// 需求：利用公式求一元二次方程的两根
		// 输入系数a,b.c的值根据判别式，判断根的情况并求解

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入方程的系数a：");
		int a = sc.nextInt();
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
