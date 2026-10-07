package lesson03;

import java.util.Scanner;

/**
 * lesson03：if-else 分支练习——把猜数字的判断逻辑单独拿出来。
 * <p>
 * 答案固定为 25，玩家只猜一次，程序给出「太小了 / 太大了 / 猜中了」三种反馈。
 * 这一步的目的不是做游戏，而是先把三分支判断写熟练。
 *
 * @author 杨训杰
 */
public class GuessCompare {

    /**
     * 程序入口：读取一个整数并与固定答案比较。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int secret = 25; // 本课的固定答案

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");

        int guess = scanner.nextInt();

        if (guess < secret) {
            System.out.println("太小了喵");
        } else if (guess > secret) {
            System.out.println("太大了喵");
        } else {
            System.out.println("恭喜，猜中了喵");
        }

        scanner.close();
    }
}
