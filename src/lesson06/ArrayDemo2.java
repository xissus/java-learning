package lesson06;

public class ArrayDemo2 {

	/**
	 * 程序入口：演示索引取值与赋值。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// 1、取值：把 0 索引上的元素取出并赋给 number
		int number = arr[0];
		System.out.println(number);

		// 也可以直接打印某个索引对应的元素
		System.out.println(arr[0]);

		// 2、存值：把 0 索引上的数据改成 100（原数据被覆盖，不再存在）
		arr[0] = 100;
		System.out.println(arr[0]);
	}
}
