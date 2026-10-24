package day04;

public class WhileDemo2 {

	public static void main(String[] args) {
		// 分析：
		// 折叠纸张，每次折叠纸张厚度都是原来两倍
		double height = 8844430;// 定义山峰的高度
		double paper = 0.1;// 定义一张纸张的厚度
		double count = 0;// 定义变量来统计次数
		while (paper < height) {
			paper = paper * 2;
			count++;// 每满足一次循环，count自加一次
		}
		System.out.println("需要折叠" + count + "次");
	}

}
