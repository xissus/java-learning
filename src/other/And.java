package other;

public class And {

	public static void main(String[] args) {
		// 题目：算 45.98 + 78.12 的和，但结果要求输出成整数
		double a = 45.98;
		double b = 78.12;

		// (int) 就是强制类型转换：把右边算出来的小数，硬塞进左边的 int 里。
		// 记住它是「砍掉」小数，不是四舍五入——(int) 124.9 也得 124。
		// 两个括号别省：(int) (a + b) 是先算和再砍，
		// 写成 (int) a + b 就变成先把 a 砍成 45 再相加了，结果不对。
		int sum = (int) (a + b);

		// 输出结果：124
		System.out.println(sum);
	}

}
