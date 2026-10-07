package lesson06;

/**
 * lesson06：数组的两种初始化方式与「地址值」现象。
 * <p>
 * 演示一个关键现象：直接打印数组名，输出的不是数组里的元素，
 * 而是类似 {@code [I@2f92e0f4} 的地址值（十六进制），
 * 所以想看到元素内容必须用索引或遍历。
 *
 * @author 杨训杰
 */
public class ArrayDemo1 {

    /**
     * 程序入口：打印数组名，观察地址值。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        // 完整写法：new int[] {...}
        int[] arr1 = new int[] {12, 13, 14, 15};

        // 打印数组名输出的是地址值：[I 表示一维 int 数组，@ 后面是十六进制地址
        System.out.println(arr1);
    }
}
