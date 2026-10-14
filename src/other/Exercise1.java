package other;

import java.util.Scanner;//使用Scanner时先导包

public class Exercise1 {

	public static void main(String[] args) {
		// 需求：输入一个整数，如果它大于 0，就输出这个数的 60%；
		// 否则（0 或负数）原样输出这个数

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = sc.nextInt();

		// 标志变量：先默认「它不是正数」，确认 num > 0 之后再改成 true。
		// 这种「先把状态记下来、后面再拿来判断」的写法，
		// 好处是一个 if (a) 就能分出两条路，不用把条件写两遍。
		boolean a = false;
		if (num > 0) {
			a = true; // 确认是正数了，把状态改掉
		}

		// 回头看刚才记下的状态，决定走哪条路。
		// 注意这个 if 要和它下面的 else 平级 —— 位置错了，0 和负数就会没人管。
		if (a) {
			// 60% 就是乘 0.6；用 double 存结果，小数才不会被砍掉
			double result = (double) (num * 0.6);
			System.out.println("结果" + result);
		} else {
			// 不是正数的情况：0 和负数都走到这里，原样输出
			System.out.println("结果为" + num);
		}

		sc.close(); // 用完了把 Scanner 关掉，养成好习惯
	}

}
