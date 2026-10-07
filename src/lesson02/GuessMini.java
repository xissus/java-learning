package lesson02;

import java.util.Scanner;

/**
 * lesson02：Scanner 入门练习。
 * <p>
 * 只做一件事——读入一个整数并原样打印出来，用来熟悉
 * {@code import java.util.Scanner}、创建对象和 {@code nextInt()} 的写法。
 *
 * @author 杨训杰
 */
public class GuessMini {

    /**
     * 程序入口：读取一个整数并打印。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数喵");

        int number = scanner.nextInt();

        System.out.println("你输入的是: " + number);
        scanner.close();
    }
}
