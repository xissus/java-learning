package other;

public class Exercise3 {

	public static void main(String[] args) {
		// 需求：计算 1~500 中所有「能被 7 整除」的数的平方和（数组版）

		// 第一步：造一个能装 500 个格子的数组，把 1~500 依次放进去
		int[] arr = new int[500];
		for (int i = 0; i < arr.length; i++) {
			// 下标 i 是 0、1、2…，要装的数是 1、2、3…，所以统一加 1
			arr[i] = i + 1;
		}

		// 第二步：从头扫一遍数组，挑出 7 的倍数累加平方
		long sum = 0; // 累加器，从 0 开始（记住：加法从 0 开始，乘法从 1 开始）
		for (int i = 0; i < arr.length; i++) {
			// % 是取余：arr[i] % 7 等于 0，就说明这个数能被 7 整除
			if (arr[i] % 7 == 0) {
				// 把它的平方加进累加器：arr[i] * arr[i] 就是这个数的平方
				sum = sum + arr[i] * arr[i];
			}
		}

		System.out.println("结果为" + sum);
	}

}
