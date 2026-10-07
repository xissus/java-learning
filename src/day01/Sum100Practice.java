package day01;

/**
 * day01：求和练习（留白版）——把 1 加到 100。
 * <p>
 * 这一份是<b>故意没写完</b>的版本，留给你自己动手：
 * 循环体里只有一句 TODO，需要你补上"把 i 加到 sum 上"这一步。
 * <p>
 * <b>先别打开 {@code Sum100.java}</b>，那是完成版。自己写出来的才算数。
 * 写完可以对照检查，也可以直接运行本文件看结果对不对。
 * <p>
 * 小提示：现在的代码跑出来是「总和是0」——因为 sum 从头到尾没被加过任何东西。
 *
 * @author 杨训杰
 */
public class Sum100Practice {

    /**
     * 程序入口：循环 1 到 100 累加并输出总和。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i = i + 1) {
            // TODO: 这里把 i 加到 sum 上，试试自己写出来
        }

        System.out.println("总和是" + sum);
    }
}
