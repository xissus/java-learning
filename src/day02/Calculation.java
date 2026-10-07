package day02;

import java.util.Scanner;

/**
 * day02：四则运算练习——读两个整数，输出和、差、商、积。
 * <p>
 * 第一次把 Scanner 和算术运算结合起来用。
 * <p>
 * 注意：这里的「商」是用 {@code num1 / num2} 算的，两个整数相除，
 * 结果会被截断成整数（例如 7 / 2 得到 3 而不是 3.5），
 * 想要小数结果需要写成 {@code (double) num1 / num2}。
 *
 * @author 杨训杰
 */
public class Calculation {

    /**
     * 程序入口：读取两个整数并输出四则运算结果。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println("请再输入一个整数");
        int num2 = sc.nextInt();

        System.out.println("两数之和为:" + (num1 + num2));
        System.out.println("两数之差为:" + (num1 - num2));
        System.out.println("两数之商为:" + (num1 / num2));
        System.out.println("两数之积为:" + (num1 * num2));

        sc.close();
    }
}
