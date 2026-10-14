package day01;

public class Sum100 {

	/**
	 * 程序入口：计算 1~100 的累加和。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i = i + 1) {
			sum = sum + i;
		}

		System.out.println("总和是" + sum);
	}
}
