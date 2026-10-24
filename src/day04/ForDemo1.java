package day04;

public class ForDemo1 {

	public static void main(String[] args) {
		// 分析；
		// 循环1~100得到每个数字
		// 初始条件为1；结束条件为100
		int sum = 0;// 定义一个变量sum，作为用来存储i值的变量
		for (int i = 0; i <= 100; i++) {// 使用for循环
			sum = sum + i;// 把i的值累加到变量sum里；简化可以写为sum += i
		}
		System.out.println("从1加到100的值为：" + sum);
	}

}
		//进阶可以考虑打印一定范围内满足要求的数字
		//int sum = 0;
		//for(int i = 0;i <= 100;i++) {
		//if (i % 2 ==0) {
		//sum sum + i;