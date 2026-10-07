package day02;

import java.util.Scanner;

/**
 * day02：取出一个三位整数的个位、十位、百位。
 * <p>
 * 三个公式要记住：
 * <ul>
 *   <li>个位 = {@code number % 10}</li>
 *   <li>十位 = {@code number / 10 % 10}（先去掉个位，再取余）</li>
 *   <li>百位 = {@code number / 100 % 10}（先去掉个位和十位，再取余）</li>
 * </ul>
 * 例如输入 456：个位 6、十位 5、百位 4。
 * <p>
 * 这个思路后来在 lesson05 里被改写成了三个独立的方法。
 *
 * @author 杨训杰
 */
public class Test1 {

    /**
     * 程序入口：读入三位整数并输出各位数字。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位整数");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        System.out.println("个位是" + ge);
        System.out.println("十位是" + shi);
        System.out.println("百位是" + bai);

        sc.close();
    }
}
