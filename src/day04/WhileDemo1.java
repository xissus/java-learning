package day04;

import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		//分析：
		//不用除法运算相关的运算符，来进行除法运算，可以考虑除法的底层逻辑
		//除法本质是减法的简便运算，那么就可以运用减法的相关性质来解决
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个被除数");
		int dividend = sc.nextInt();
		System.out.println("请输入一个除数");
		int divisor = sc.nextInt();		
		int count = 0;
		while(dividend >= divisor) {
			dividend -= divisor;
			count++;
			
		}
		System.out.println("两数的相除的结果为" + count +"余" + dividend);
		

	}

}
