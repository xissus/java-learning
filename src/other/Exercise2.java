package other;

import java.util.Scanner;//使用Scanner时先导包

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
