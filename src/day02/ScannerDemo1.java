package day02;

import java.util.Scanner;

/**
 * day02：两个 Scanner 对象的练习——读两个整数求和。
 * <p>
 * 这个练习的本意是搞清楚「一个程序里可以创建多个 Scanner 对象」。
 * <p>
 * 小提醒：实际写代码时**一个 Scanner 就够了**，反复创建多个 Scanner 指向同一个
 * 键盘输入，容易因为缓冲区问题出现奇怪的等待或读不到数据的情况。
 * 这个类保留原样作为当时的记录。
 *
 * @author 杨训杰
 */
public class ScannerDemo1 {

    /**
     * 程序入口：用两个 Scanner 分别读一个整数并求和。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int i1 = sc1.nextInt();
        System.out.println("请再输入一个整数");
        int i2 = sc2.nextInt();

        System.out.println("两数和为" + (i1 + i2));

        sc1.close();
        sc2.close();
    }
}
