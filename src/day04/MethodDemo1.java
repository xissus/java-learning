package day04;

public class MethodDemo1 {
//一定是先定义方法再调用！
	public static void main(String[] args) {
		// 目标：区分什么时候使用带返回值的方法
		// 需求：定义一个方法，比较两个长方形的面积
		// 调用方法获取长方形的面积在进行比较
		double a = getArea(10, 5);
		double b = getArea(5, 10);
		if (a > b) {
			System.out.println("长方形a的面积大于b");
		} else if (a < b) {
			System.out.println("长方形a的面积小于b");
		} else {
			System.out.println("长方形a的面积等于b");
		}
	}

	// 定义一个方法求长方形的面积，需要判断定义哪种方法，是否需要用带返回值的方法
	public static double getArea(double len, double withed) {
		double Area = len * withed;
		return Area;

	}
}