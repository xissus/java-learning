package lesson06;

public class ArrayDemo3 {

	/**
	 * 程序入口：三种遍历写法的对比。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		// 1、定义数组
		int[] arr = { 1, 2, 3, 4, 5 };

		// 2、方案一：手动逐个打印——太麻烦，本质是重复动作
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// 3、方案二：写死循环次数——数组长度一变就得改代码，不是最完美的方案
		// for (int i = 0; i < 5; i++) {
		// System.out.println(arr[i]);
		// }

		// 4、方案三（推荐）：用 length 属性动态获取数组长度，写法为「数组名.length」
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
