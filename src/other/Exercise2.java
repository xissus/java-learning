package other;

import java.util.Scanner;//使用Scanner时先导包

public class Exercise2 {

	public static void main(String[] args) {
		// 编写一个程序，利用循环结构计算整数n的阶乘（n为用户输入的值）
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = sc.nextInt();
		boolean isPositive = false;
		if (n >= 0) {
			isPositive = true;
		}
		if (isPositive) {
			long product = 1;// 乘法初始化为1
			for (int i = 1; i <= n; i++) {
				product = product * i;
			}
			System.out.println("该数的阶乘为" + product);
		} else {
			System.out.println("负数没有阶乘");
		}
		sc.close();
	}

}
