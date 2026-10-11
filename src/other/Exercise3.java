package other;

public class Exercise3 {

	public static void main(String[] args) {
		// 编写一个程序，利用循环结构计算1-500中能被7整除的所有数的平方和（数组版）
		int[] arr = new int[500];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0) {
				sum = sum + arr[i] * arr[i];
			}

		}
		System.out.println("结果为" + sum);
	}

}
