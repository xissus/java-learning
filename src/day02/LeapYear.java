package day02;

import java.util.Scanner;

/**
 * day02：判断闰年（逻辑运算符综合练习）。
 * <p>
 * 闰年的判断规则：
 * <ul>
 *   <li>能被 4 整除，且不能被 100 整除；</li>
 *   <li>或者能被 400 整除。</li>
 * </ul>
 * 写成代码就是 {@code (year % 4 == 0 && year % 100 != 0) || year % 400 == 0}。
 * <p>
 * 这是第一次把 {@code &&}（并且）和 {@code ||}（或者）组合在一起用。
 * 特别注意：{@code &&} 的优先级比 {@code ||} 高，所以这里即使不加括号结果也一样，
 * 但加上括号更清楚、更不容易看错。
 *
 * @author 杨训杰
 */
public class LeapYear {

    /**
     * 程序入口：读入年份并判断是否为闰年。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入需要判断的年份：");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }

        sc.close();
    }
}
