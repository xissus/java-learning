package day01;

public class Check {

	/**
	 * 程序入口：判断温度并输出提示。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int temperature = 34;

		if (temperature > 30) {
			System.out.println("今天真热，注意防暑");
		} else {
			System.out.println("今天天气还不错");
		}
	}
}
