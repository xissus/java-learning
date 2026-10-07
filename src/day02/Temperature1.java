package day02;

import java.util.Scanner;

/**
 * day02：华氏度转摄氏度（小数输入与算术表达式）。
 * <p>
 * 读取一个华氏度，按公式 {@code 摄氏 = (华氏 - 32) * 5 / 9} 换算。
 * <p>
 * 关键点：这里写的是 {@code 5.0 / 9.0} 而不是 {@code 5 / 9} ——
 * 因为 5 / 9 是整数除法，结果会直接变成 0，整个算式就全错了。
 *
 * @author 杨训杰
 */
public class Temperature1 {

    /**
     * 程序入口：读入华氏度并输出对应摄氏度。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个华氏度:");
        double f = sc.nextDouble();

        double t = (f - 32) * 5.0 / 9.0;

        System.out.println("摄氏度为:" + t);

        sc.close();
    }
}
