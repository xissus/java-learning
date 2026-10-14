package day03;

import java.util.Scanner;

/**
 * day03：解二元一次方程组——读 6 个数，算出 x 和 y。
 * <p>
 * <b>题目：</b>求解方程组
 *
 * <pre>
 * a·x + b·y = e
 * c·x + d·y = f
 * </pre>
 *
 * 系数 a、b、c、d 和常数 e、f 都从键盘输入，输出 x 和 y。
 * <p>
 * <b>这一批里唯一带公式的一道</b>，练的其实是两件事：
 * <ol>
 * <li>把 {@code day02} 学过的 {@code Scanner} + {@code double} 用起来 （这里必须用
 * {@code double}，因为解一般是小数）；</li>
 * <li><b>先判断「有没有解」，再动手算</b> —— 这是这一课真正的重点。</li>
 * </ol>
 * <p>
 * <b>为什么先判断 {@code a * d - b * c == 0}？</b> 因为解方程用的是这两个公式：
 *
 * <pre>
 * x = (e·d − b·f) / (a·d − b·c)
 * y = (a·f − e·c) / (a·d − b·c)
 * </pre>
 *
 * 分母都是 {@code a·d − b·c}。一旦它等于 0，就变成**除以 0**， 算出来的结果没有意义。所以要先把这个「危险分母」挡在门外，再去算
 * —— 这和你之前 {@code QuadraticFormula} 里「先看 a 是不是 0，再套求根公式」是同一个思路：
 * <b>先把会让公式崩溃的情况剔掉，剩下的才敢下手。</b>
 * <p>
 * <b>运行后你会看到：</b>
 *
 * <pre>
 * 请输入a，b，e的值：
 * 请输入c，d，f的值：
 * x = 2.0             （输入 a=1 b=1 e=3 和 c=1 d=-1 f=1，
 * y = 1.0              也就是 x+y=3 和 x−y=1，解得 x=2、y=1）
 * </pre>
 * <p>
 * <b>两个可以想一想的点：</b>
 * <ul>
 * <li>代码里那句 {@code 次方程组无解} 是错别字，应该是「**此**方程组无解」（把「此」写成了「次」）。
 * 顺手改掉，程序输出也是给用户看的，错别字会影响观感。</li>
 * <li>{@code a·d − b·c == 0} 的时候，真的只有「无解」一种可能吗？ 提示：拿 {@code a=1 b=1 e=1} 配
 * {@code c=2 d=2 f=2} 试试看 —— 第二个方程其实就是第一个方程乘 2。这种情况数学上叫「有无穷多组解」，
 * 和「无解」是两回事，但程序现在把它们混为一谈了。</li>
 * </ul>
 *
 * @author 杨训杰
 */
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
