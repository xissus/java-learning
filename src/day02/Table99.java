package day02;

public class Table99 {

	/**
	 * 程序入口：用两层循环打印 9×9 乘法表。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j = j + 1) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println(); // 一行打印完，换行
		}
	}
}
