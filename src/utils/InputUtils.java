package utils;

import java.util.Scanner;

/**
 * 控制台输入工具类。
 * <p>
 * 把各个 lesson 里反复出现的「读取一个整数」「读取一个范围内的整数」等输入校验逻辑
 * 集中到一处，避免每写一个新程序都要复制一遍 while + hasNextInt 的模板代码。
 * <p>
 * 使用示例：
 * <pre>{@code
 * Scanner sc = new Scanner(System.in);
 * int age = InputUtils.readInt(sc, "请输入你的年龄：");
 * int score = InputUtils.readIntInRange(sc, "请输入成绩：", 0, 100);
 * sc.close();
 * }</pre>
 * <p>
 * 说明：工具类只提供静态方法，不需要（也不应该）创建对象，因此构造方法被私有化。
 *
 * @author 杨训杰
 */
public final class InputUtils {

    /**
     * 私有构造方法：阻止外部通过 {@code new InputUtils()} 创建实例。
     */
    private InputUtils() {
        // 工具类不需要实例，什么都不做
    }

    /**
     * 反复提示用户输入，直到读到合法的整数为止。
     *
     * @param scanner 已经创建好的 Scanner 对象，由调用方负责关闭
     * @param prompt  每次输入前显示的提示文字
     * @return 用户输入的整数
     */
    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            // 读到的不是整数：把这段无效内容丢弃，然后重新提示
            System.out.println("输入的不是整数，请重新输入。");
            scanner.next();
        }
    }

    /**
     * 反复提示用户输入，直到读到位于 [min, max] 区间内的整数为止。
     *
     * @param scanner 已经创建好的 Scanner 对象，由调用方负责关闭
     * @param prompt  每次输入前显示的提示文字
     * @param min     允许的最小值（包含）
     * @param max     允许的最大值（包含）
     * @return 区间内的整数
     */
    public static int readIntInRange(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            int number = readInt(scanner, prompt);

            if (number >= min && number <= max) {
                return number;
            }

            System.out.println("输入错误，请输入 " + min + " 到 " + max + " 之间的整数。");
        }
    }

    /**
     * 反复提示用户输入，直到读到区间内的整数，或者读到了约定的退出值为止。
     * <p>
     * 常用于猜数字这类「输入 0 就退出」的场景。
     *
     * @param scanner   已经创建好的 Scanner 对象，由调用方负责关闭
     * @param prompt    每次输入前显示的提示文字
     * @param min       允许的最小值（包含）
     * @param max       允许的最大值（包含）
     * @param exitValue 退出值，读到该值立刻原样返回，由调用方决定如何退出
     * @return 区间内的整数，或者 {@code exitValue}
     */
    public static int readIntInRangeOrExit(Scanner scanner, String prompt, int min, int max, int exitValue) {
        while (true) {
            int number = readInt(scanner, prompt);

            if (number == exitValue) {
                return exitValue;
            }

            if (number >= min && number <= max) {
                return number;
            }

            System.out.println("输入错误，请输入 " + min + " 到 " + max + " 之间的整数，"
                    + "或输入 " + exitValue + " 退出。");
        }
    }

    /**
     * 读取一个不含空格的单词，例如姓名、代号。
     *
     * @param scanner 已经创建好的 Scanner 对象，由调用方负责关闭
     * @param prompt  输入前显示的提示文字
     * @return 用户输入的字符串（不含空白字符）
     */
    public static String readWord(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}
