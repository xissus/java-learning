package day02;

public class Odd {

	/**
	 * 程序入口：判断 2027 是奇数还是偶数。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int year = 2027;

		if (year % 2 == 0) {
			System.out.println(year + "是偶数");
		} else {
			System.out.println(year + "是奇数");
		}
	}
}
