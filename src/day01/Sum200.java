package day01;

/**
 * day01：for 循环练习——从 5 开始不断累加。
 * <p>
 * 变量 a 的初始值是 5，循环 1~50，每轮把 i 加进 a 里并且立刻打印。
 * <p>
 * 注意：这里 {@code System.out.println} 写在了循环**里面**，所以会边加边打印 50 行，
 * 而不是只在最后打印一个结果。这是当时踩过的一个坑，原样保留下来当记录。
 * 想让程序只输出最后一个结果，把打印语句挪到循环外面即可。
 *
 * @author 杨训杰
 */
public class Sum200 {

    /**
     * 程序入口：从 5 开始累加 1~50 并打印。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        int a = 5;

        for (int i = 1; i <= 50; i++) {
            a = a + i;
            System.out.println("总和为" + a);
        }
    }
}
