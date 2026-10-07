package lesson05;

import java.util.Scanner;

/**
 * lesson05：方法定义与调用练习——拆分数位 + 累加求和。
 * <p>
 * 程序读取一个三位整数，分别取出它的个位、十位、百位，并计算 1~50 的和。
 * 每个功能都被抽成了一个独立的方法，用来练习「定义方法 / 调用方法 / 返回值」。
 *
 * @author 杨训杰
 */
public class DigitMethods {

    /**
     * 程序入口：读入三位数并依次输出各位数字与累加结果。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = readThreeDigitNumber(sc);

        int ones = getOnesPlace(number);
        System.out.println("个位是：" + ones);
        int tens = getTensPlace(number);
        System.out.println("十位是：" + tens);
        int hundreds = getHundredsPlace(number);
        System.out.println("百位是：" + hundreds);

        int sum = sumTo(50);
        System.out.println("1到50的总和是：" + sum);

        sc.close();
    }

    /**
     * 反复提示用户输入，直到读到 100~999 之间的整数为止。
     *
     * @param sc 已经创建好的 Scanner 对象
     * @return 合法范围内的三位整数
     */
    public static int readThreeDigitNumber(Scanner sc) {
        while (true) {
            System.out.println("请输入一个100到999之间的三位整数：");

            // 读到的不是整数：丢弃这段内容，重新读
            if (!sc.hasNextInt()) {
                System.out.println("输入的不是整数，请重新输入。");
                sc.next();
                continue;
            }

            int number = sc.nextInt();
            if (number >= 100 && number <= 999) {
                return number; // 合法就直接返回，方法到此结束
            }
            System.out.println("输入错误，请输入100到999之间的整数。");
        }
    }

    /**
     * 取一个整数的个位数。
     *
     * @param number 任意整数
     * @return 个位数字
     */
    public static int getOnesPlace(int number) {
        return number % 10; // 对 10 取余，剩下的就是个位
    }

    /**
     * 取一个整数的十位数。
     *
     * @param number 任意整数
     * @return 十位数字
     */
    public static int getTensPlace(int number) {
        return number / 10 % 10; // 先去掉个位，再对 10 取余
    }

    /**
     * 取一个整数的百位数。
     *
     * @param number 任意整数
     * @return 百位数字
     */
    public static int getHundredsPlace(int number) {
        return number / 100 % 10; // 先去掉个位和十位，再对 10 取余
    }

    /**
     * 计算 1 累加到 {@code max} 的总和。
     *
     * @param max 累加的终点（包含该数）
     * @return 1 + 2 + ... + max 的结果
     */
    public static int sumTo(int max) {
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
