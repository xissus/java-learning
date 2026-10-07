package day02;

/**
 * day02：整数除法 vs 小数除法。
 * <p>
 * 这是最重要的一个坑：
 * <ul>
 *   <li>{@code 10 / 3} 两个都是整数，Java 做的是**整数除法**，小数部分被直接丢掉，结果是 3；</li>
 *   <li>{@code 10.0 / 3} 只要其中一个写成了小数，结果就是小数，约等于 3.333...。</li>
 * </ul>
 * 以后算平均分、算比例时，必须记得把其中一个数字变成小数，
 * 或者写成 {@code (double) 总数 / 个数}。
 *
 * @author 杨训杰
 */
public class Divide {

    /**
     * 程序入口：对比两种除法的结果。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        System.out.println(10 / 3);   // 整数除法，结果是 3
        System.out.println(10.0 / 3); // 小数除法，结果是 3.3333333333333335
    }
}
