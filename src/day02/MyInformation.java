package day02;

import java.util.Scanner;

/**
 * day02：录入个人信息（重点：nextLine 和 nextInt 混用）。
 * <p>
 * 依次读入姓名、学号、性别、年龄和一句自我激励的话，然后统一打印出来。
 * <p>
 * 这里踩过一个很经典的坑：{@code nextInt()} 只读走数字，会把后面的「回车符」留在输入里，
 * 于是紧接着的 {@code nextLine()} 会立刻读到那个空回车，看起来像「程序自己跳过了输入」。
 * 解决办法就是在 {@code nextInt()} 后面补一句 {@code sc.nextLine()} 把回车吃掉 ——
 * 就是读取年龄之后紧跟的那一句。
 *
 * @author 杨训杰
 */
public class MyInformation {

    /**
     * 程序入口：读入个人信息并格式化输出。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = sc.nextLine();

        System.out.print("请输入学号：");
        String studentId = sc.nextLine();

        System.out.print("请输入性别：");
        String gender = sc.nextLine();

        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        sc.nextLine(); // 吃掉 nextInt 留下的回车符，否则下一句会读到空行

        System.out.print("请输入一句自我激励的话：");
        String motto = sc.nextLine();

        System.out.println();

        System.out.println("姓名：" + name);
        System.out.println("学号：" + studentId);
        System.out.println("性别：" + gender);
        System.out.println("年龄：" + age);

        System.out.println("自我激励：" + motto);

        sc.close();
    }
}
