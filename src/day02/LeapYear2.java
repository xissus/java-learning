package day02;

/**
 * day02：闰年判断的「方法化」版（进阶练习）。
 * <p>
 * 和 {@code LeapYear} 判断的是同一件事，但这里把判断逻辑抽成了一个独立的方法
 * {@code isLeapYear(int year)}，然后遍历一个数组批量判断多个年份。
 * <p>
 * 这是从「写一段代码」到「把一段代码变成可复用的方法」的关键一步。
 * <p>
 * 运行结果：2026 不是闰年、2024 是闰年、2000 是闰年、1900 不是闰年。
 *
 * @author 杨训杰
 */
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
