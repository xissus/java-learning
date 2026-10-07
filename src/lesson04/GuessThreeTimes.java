package lesson04;

import java.util.Scanner;

/**
 * lesson04：while 循环 + 机会次数控制。
 * <p>
 * 在 lesson03 的三分支判断外面套上 while 循环，最多允许猜 3 次，
 * 并新增一个 boolean 标记位记录「到底有没有猜中」。
 * <p>
 * 涉及知识点：while 循环、计数器 attempts、循环内 break、循环结束后的收尾判断。
 *
 * @author 杨训杰
 */
public class GuessThreeTimes {

    /**
     * 程序入口：循环读入猜测，最多猜 3 次。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secret = 25;                  // 本课的固定答案
        int attempts = 0;                 // 已经用掉的机会次数
        int maxAttempts = 3;              // 允许猜测的总次数
        boolean guessedCorrectly = false; // 是否猜中

        System.out.println("我想好了一个数字");
        System.out.println("你有" + maxAttempts + "次机会");

        while (attempts < maxAttempts) {
            System.out.println("请输入你的猜测");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("太小了");
            } else if (guess > secret) {
                System.out.println("太大了");
            } else {
                System.out.println("恭喜，你猜中了");
                guessedCorrectly = true;
                break; // 猜中就没必要继续循环了
            }
        }

        // 机会用完了还没猜中，才公布答案
        if (!guessedCorrectly && attempts == maxAttempts) {
            System.out.println("机会用完了，答案是" + secret);
        }

        scanner.close();
    }
}
