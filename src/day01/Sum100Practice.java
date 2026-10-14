package day01;

public class Sum100Practice {

	/**
	 * 程序入口：循环 1 到 100 累加并输出总和。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i = i + 1) {
			// 这一句原本是个 TODO，留着自己写；我写出来的就是下面这一行
			sum = sum + i;
		}

		System.out.println("总和是" + sum);
	}
}
