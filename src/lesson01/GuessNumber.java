package lesson01;

import java.util.Random;
import java.util.Scanner;

/**
 * lesson01：猜数字游戏（第一个综合小程序）。
 * <p>
 * 程序随机生成一个 1~50 的整数，玩家最多有 5 次机会猜中它。
 * 输入 0 可以中途退出；输入非整数或超出范围的数字属于无效输入，不消耗次数。
 * <p>
 * 涉及知识点：Scanner 键盘输入、Random 随机数、while 循环、if-else 分支、
 * break / continue、boolean 标记位。
 *
 * @author 杨训杰
 */
public class GuessNumber {

    /**
     * 程序入口：负责创建输入 / 随机数对象，然后进入游戏主循环。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(50) + 1; // 答案：nextInt(50) 得到 0~49，加 1 后变成 1~50
        int attempts = 0;                    // 已经用掉的机会次数
        int maxAttempts = 5;                 // 总机会次数
        boolean guessedCorrectly = false;    // 是否猜中，作为循环结束后的判断依据

        System.out.println("我想好了一个 1 到 50 的数字");
        System.out.println("你有 " + maxAttempts + " 次机会");

        while (attempts < maxAttempts) {
            System.out.print("请输入你的猜测：");

            // 输入校验：不是整数就丢弃这次输入并重新提示，不消耗机会
            if (!scanner.hasNextInt()) {
                System.out.println("输入的不是整数，请重新输入");
                scanner.next();
                continue;
            }

            int guess = scanner.nextInt();

            // 输入 0 表示主动退出游戏
            if (guess == 0) {
                System.out.println("退出游戏");
                break;
            }

            // 越界输入同样不消耗机会，直接重新提示
            if (guess < 1 || guess > 50) {
                System.out.println("请输入1到50的数字喵~");
                continue;
            }

            attempts++; // 走到这里才算一次有效猜测

            if (guess < secret) {
                System.out.println("太小了喵~");
            } else if (guess > secret) {
                System.out.println("太大了喵~");
            } else {
                System.out.println("恭喜！你用了 " + attempts + " 次猜中了。");
                guessedCorrectly = true;
                break;
            }

            System.out.println("还剩 " + (maxAttempts - attempts) + " 次机会。");
        }

        // 机会用完且始终没猜中时，公布答案
        if (!guessedCorrectly && attempts == maxAttempts) {
            System.out.println("机会用完啦喵~，答案是：" + secret);
        }

        scanner.close();
    }
}
