package day01;

/**
 * day01：for 循环练习——倒着数、每次减 2。
 * <p>
 * 循环三要素在这里看得很清楚：起始值 i = 10，结束条件 i >= 1，每次变化 i = i - 2。
 * 所以会依次输出「这是第10遍」一直到「这是第2遍」，共 5 次。
 *
 * @author 杨训杰
 */
public class Loop {

    /**
     * 程序入口：演示 for 循环的三要素。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i = i - 2) {
            System.out.println("这是第" + i + "遍");
        }
    }
}
