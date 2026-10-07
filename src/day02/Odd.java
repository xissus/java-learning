package day02;

/**
 * day02：判断奇数还是偶数（取余运算 {@code %}）。
 * <p>
 * 核心判断条件：{@code year % 2 == 0}。
 * {@code %} 是取余数，一个数除以 2 余数为 0，说明它能被 2 整除，也就是偶数。
 * <p>
 * 注意：这个类里的变量名叫 year（年份），但实际判断的是奇偶，属于最早期的随手命名，
 * 保留原样作为记录。
 *
 * @author 杨训杰
 */
public class Odd {

    /**
     * 程序入口：判断 2027 是奇数还是偶数。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int year = 2027;

        if (year % 2 == 0) {
            System.out.println(year + "是偶数");
        } else {
            System.out.println(year + "是奇数");
        }
    }
}
