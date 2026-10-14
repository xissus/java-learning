package lesson06;

public class ArrayDemo1 {

	/**
	 * 程序入口：打印数组名，观察地址值。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		// 完整写法：new int[] {...}
		int[] arr1 = new int[] { 12, 13, 14, 15 };

		// 打印数组名输出的是地址值：[I 表示一维 int 数组，@ 后面是十六进制地址
		System.out.println(arr1);
	}
}
