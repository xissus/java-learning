package day02;

public class LeapYear2 {

	/**
	 * 程序入口：批量判断数组中的年份是否为闰年。
	 *
	 * @param args 命令行参数（本程序未使用）
	 */
	public static void main(String[] args) {
		int[] years = {2026, 2024, 2000, 1900};

		for (int i = 0; i < years.length; i++) {
			if (isLeapYear(years[i])) {
				System.out.println(years[i] + " 是闰年");
			} else {
				System.out.println(years[i] + " 不是闰年");
			}
		}
	}

	/**
	 * 判断某个年份是否是闰年。
	 *
	 * @param year 待判断的年份
	 * @return 是闰年返回 {@code true}，否则返回 {@code false}
	 */
	static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
