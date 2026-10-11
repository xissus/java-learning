package other;

public class And {
         //编写一个程序，计算45.98与78.12的和，并要求输出结果为整数
	public static void main(String[] args) {
		double a = 45.98;
		double b = 78.12;
		int sum = (int) (a + b);//强制类型转换，直接砍掉小数部分
		System.out.println(sum);// TODO Auto-generated method stub

	}

}
