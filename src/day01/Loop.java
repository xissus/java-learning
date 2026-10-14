package day01;

public class Loop {

	/**
	 * 程序入口：演示 for 循环的三要素。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		for (int i = 10; i >= 1; i = i - 2) {
			System.out.println("这是第" + i + "遍");
		}
	}
}
