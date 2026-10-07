package day02;

/**
 * day02：打印九九乘法表（循环嵌套的经典题）。
 * <p>
 * 外层循环 i 控制「第几行」，内层循环 j 控制「这一行打印几列」。
 * 关键点是内层的结束条件写成 {@code j <= i} —— 第 1 行打印 1 列，
 * 第 2 行打印 2 列……这样才形成三角形。
 * <p>
 * 另外两个细节：
 * <ul>
 *   <li>{@code System.out.print} 不换行，用来把一行的算式连起来；</li>
 *   <li>{@code "\t"} 是制表符，用来让各列对齐；</li>
 * </ul>
 * 内层循环结束后用一次 {@code System.out.println()} 换行，开始下一行。
 *
 * @author 杨训杰
 */
public class Table99 {

    /**
     * 程序入口：用两层循环打印 9×9 乘法表。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j = j + 1) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println(); // 一行打印完，换行
        }
    }
}
