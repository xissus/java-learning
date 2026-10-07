package lesson06;

/**
 * lesson06：数组遍历 + 条件统计。
 * <p>
 * 题目：定义数组存储 1~10，遍历取出每个元素，统计其中能被 3 整除的数字个数。
 *
 * @author 杨训杰
 */
public class ArrayTest2 {

    /**
     * 程序入口：统计并打印数组中能被 3 整除的元素个数。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        // 1、定义数组，存储 1 到 10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 统计个数的计数器
        int count = 0;

        // 2、遍历数组取出每一个元素：i 是索引，arr[i] 是对应元素
        for (int i = 0; i < arr.length; i++) {
            // 3、判断当前元素是否是 3 的倍数，是就让计数器加 1
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                count++;
            }
        }

        // 循环结束后所有数字都判断完了，直接打印结果
        System.out.println("数组中能被3整除的数字有" + count + "个");
    }
}
