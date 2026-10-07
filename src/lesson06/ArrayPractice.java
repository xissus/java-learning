package lesson06;

import java.util.Scanner;

/**
 * lesson06：数组综合练习——录入成绩并统计总分与平均分。
 * <p>
 * 用 Scanner 依次读入 5 个成绩存入数组，再遍历数组求和、求平均分并逐个打印。
 * <p>
 * 涉及知识点：数组的声明与初始化、{@code array.length}、数组遍历、
 * 强制类型转换 {@code (double)} 避免整数除法截断。
 * <p>
 * 说明：使用 Scanner 需要先在 package 下面写 {@code import java.util.Scanner;}。
 *
 * @author 杨训杰
 */
public class ArrayPractice {

    /**
     * 程序入口：录入 5 个成绩并输出统计结果。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1、先把成绩逐个读进数组（数组长度 5，即要录入 5 个成绩）
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩：");
            scores[i] = sc.nextInt();
        }

        // 2、遍历数组累加求和
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        // 3、求平均分：先转成 double，否则整数除法会把小数截断
        double average = (double) sum / scores.length;

        // 4、打印每个成绩和统计结果
        System.out.println("输入的成绩为：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个成绩：" + scores[i]);
        }
        System.out.println("总分是：" + sum);
        System.out.println("平均分是：" + average);

        sc.close();
    }
}
