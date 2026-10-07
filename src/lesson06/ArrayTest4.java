package lesson06;

import java.util.Scanner;

/**
 * lesson06：String 类型数组练习——批量录入学生姓名。
 * <p>
 * 数组类型不只是 int，也可以是 String、double 等任意类型。
 * 本程序演示 {@code String[]} 的声明与遍历：先循环录入 50 个姓名，再循环打印出来。
 *
 * @author 杨训杰
 */
public class ArrayTest4 {

    /**
     * 程序入口：循环录入 50 个学生姓名并逐个打印。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String[] 表示「元素是 String 的数组」；这里申请 50 个位置
        String[] arr = new String[50];

        // 循环录入：next() 读到空格或回车为止
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生姓名：");
            arr[i] = sc.next();
        }

        System.out.println();
        System.out.println("输入的学生姓名为：");

        // 循环打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个学生姓名：" + arr[i]);
        }

        sc.close();
    }
}
