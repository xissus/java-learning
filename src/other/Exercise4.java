package other;

public class Exercise4 {

	public static void main(String[] args) {
		// 需求：计算 1~500 中所有「能被 7 整除」的数的平方和（for 循环版）

		// 累加器，从 0 开始（加法从 0 开始；要是累乘，就得从 1 开始）
		long sum = 0;

		// i 从 1 数到 500，注意是「小于等于」500，不能漏掉最后一个
		for (int i = 1; i <= 500; i++) {
			// % 是取余：i % 7 == 0，说明 i 能被 7 整除
			if (i % 7 == 0) {
				// i 本身就是那个数，直接平方加进去，不用先存进数组
				sum = sum + i * i;
			}
		}

		System.out.println("结果为" + sum);
	}

}
