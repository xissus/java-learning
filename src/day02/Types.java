package day02;

public class Types {

	/**
	 * 程序入口：定义四种类型的变量并拼接输出。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int age = 18;
		double height = 1.78;
		boolean isStudent = true;
		String name = "杨训杰";

		System.out.println(name + " " + age + "岁" + height + "米");
		System.out.println("还是学生吗？" + isStudent);
	}
}
