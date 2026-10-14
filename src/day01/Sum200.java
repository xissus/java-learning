package day01;

public class Sum200 {

	/**
	 * 程序入口：从 5 开始累加 1~50 并打印。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int a = 5;

		for (int i = 1; i <= 50; i++) {
			a = a + i;
			System.out.println("总和为" + a);
		}
	}
}
