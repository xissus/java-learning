package other;

public class Exercise4 {

	public static void main(String[] args) {
		// 编写一个程序，利用循环结构计算1-500中能被7整除的所有数的平方和（for循环版）
		long sum = 0;
		for (int i = 1; i <= 500; i++) {
			if (i % 7 == 0) {
				sum = sum + i * i;

			}
		}
		System.out.println("结果为" + sum);
	}

}
