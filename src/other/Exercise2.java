package other;

import java.util.Scanner;//使用Scanner时先导包

/**
 * other：用循环算阶乘——输入一个整数 n，算出 n!（也就是 1×2×3×…×n）。
 * <p>
 * <b>题目：</b>编写一个程序，利用循环结构计算整数 n 的阶乘（n 为用户输入的值）。
 * <p>
 * <b>思路：</b>阶乘就是「从 1 开始，一路乘到 n」。既然要重复做同一件事（乘）， 就交给 {@code for} 循环：每转一圈，把当圈的
 * {@code i} 乘进结果里。 这个「一直往身上乘」的变量叫<b>累乘器</b>——它的兄弟是累加器， 你在 Sum100 求总和、lesson06
 * 求总分时都用过，只是那里用的是 {@code +}。
 * <p>
 * <b>最容易搞错的一点：</b>累乘器的初始值要写 {@code 1}，不能写 {@code 0}。 累加时写 {@code sum = 0} 没关系（加
 * 0 不影响结果）， 但累乘时写 {@code 0} 的话，0 乘任何数都还是 0，不管乘多少次结果永远是 0。 记住一句话：<b>加法从 0 开始，乘法从
 * 1 开始。</b>
 * <p>
 * <b>为什么用 {@code long} 而不是 {@code int}？</b>{@code int} 最大约 21 亿， 而
 * {@code 13! = 6227020800} 已经超了，会装不下（这叫「溢出」）； {@code long} 能装到 900 亿亿，够算到
 * {@code 20!}。先把类型选大一点，省得后面出问题。
 * <p>
 * <b>运行后你会看到（输入 5）：</b>
 *
 * <pre>
 * 请输入一个整数
 * 该数的阶乘为120
 * </pre>
 * <p>
 * <b>两个边界情况：</b>输入 {@code 0} 会输出 {@code 1} （规定
 * {@code 0! = 1}，代码里循环一次都不执行，累乘器还是初始的 1）； 输入负数会提示「负数没有阶乘」，走的是另一个分支。
 *
 * @author 杨训杰
 */
public class Exercise2 {

	public static void main(String[] args) {
		// 需求：输入一个整数 n，用循环结构算出它的阶乘 n!
		// 思路：准备一个「累乘器」，从 1 开始，让 i 从 1 一路乘到 n

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = sc.nextInt();

		// 标志变量：先默认「这个数不合法」，等确认 n >= 0 之后再改成 true。
		// 布尔变量的名字最好一眼能看懂它代表什么状态，所以这里叫 isPositive，
		// 意思是「它是不是非负数」。
		boolean isPositive = false;
		if (n >= 0) {
			isPositive = true;
		}

		// 再根据刚才记下的状态，决定走哪一条路
		if (isPositive) {
			// 累乘器：初始值必须是 1，
			// 写 0 的话 0 乘任何数都等于 0，最后算出来永远是 0
			long product = 1;
			// i 从 1 开始，每转一圈就多乘一个数：第 1 圈乘 1，第 2 圈乘 2……
			// 转到 i 比 n 大就停下来，正好乘了 n 次
			for (int i = 1; i <= n; i++) {
				product = product * i; // 把当圈的 i 乘进累乘器里
			}
			System.out.println("该数的阶乘为" + product);
		} else {
			// n < 0：数学上负数没有阶乘，提示一下就好
			System.out.println("负数没有阶乘");
		}

		sc.close(); // 用完了把 Scanner 关掉，养成好习惯
	}

}
