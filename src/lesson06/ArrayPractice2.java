package lesson06;

public class ArrayPractice2 {

	/**
	 * 程序入口：遍历数组找出并打印最大值。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int max = arr[0]; // 临时认为 0 索引上的元素最大
		for (int i = 0; i < arr.length; i++) {
			// 依次取出每个元素与 max 比较，比 max 大就把 max 更新掉
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}
}
