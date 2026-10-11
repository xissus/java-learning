package other;

import java.util.Scanner;

public class Exercise1 {
//编写一个程序，输入一个整数，如果整数大于0，则输出整数的60%，否则输出结果为这个整数
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = sc.nextInt();
		boolean a = false;//练习使用布尔标志变量，常规可以使用if语句
		if (num > 0) {
			a = true;
		}
			
			if (a) {
				double result = (double) (num * 0.6);//int直接砍掉小数部分而double更精准
				System.out.println("结果" + result);
			} else {
				
			System.out.println("结果为" + num);
			
		}
		sc.close();

	}

}
