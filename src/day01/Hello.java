package day01;

/**
 * day01：第一个 Java 程序——把一句话打印到屏幕上。
 * <p>
 * 这是整个学习之路的起点。当时刚装好 JDK，第一个念头就是确认"环境到底通没通"，
 * 所以除了打招呼，还特意打印了一句版本验证的话。
 * <p>
 * 运行结果（屏幕上会看到两行）：
 * <pre>
 * 你好，我的 Agent 之路从这里开始
 * Java 版本验证通过！
 * </pre>
 *
 * @author 杨训杰
 */
public class Hello {

    /**
     * 程序入口：输出两行问候语。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        System.out.println("你好，我的 Agent 之路从这里开始");
        System.out.println("Java 版本验证通过！");
    }
}
