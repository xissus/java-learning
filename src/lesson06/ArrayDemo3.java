package lesson06;

/**
 * lesson06：数组遍历的演进过程（为什么最后要用 length）。
 * <p>
 * 从「一个个手动打印」到「写死循环次数」，最后到「用 {@code arr.length} 动态获取长度」，
 * 演示数组遍历写法是怎么一步步变好的。
 * <p>
 * 结论：遍历数组的标准写法是
 * {@code for (int i = 0; i < arr.length; i++) { ... }}，
 * 起始条件是 0，结束条件是「数组长度 - 1」（即最大索引）。
 *
 * @author 杨训杰
 */
public class ArrayDemo3 {

    /**
     * 程序入口：三种遍历写法的对比。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        // 1、定义数组
        int[] arr = {1, 2, 3, 4, 5};

        // 2、方案一：手动逐个打印——太麻烦，本质是重复动作
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // 3、方案二：写死循环次数——数组长度一变就得改代码，不是最完美的方案
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(arr[i]);
        // }

        // 4、方案三（推荐）：用 length 属性动态获取数组长度，写法为「数组名.length」
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
